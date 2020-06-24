package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FestivalDAO {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	private FestivalVO vo;

	public void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<FestivalVO> search(String search) {
		int cnt = 0;
		ArrayList<FestivalVO> list = new ArrayList<FestivalVO>();
		
		getConnection();
		try {
			String sql = "SELECT * FROM FESTIVAL_INFORMATION WHERE FEST_NAME LIKE ? OR CITY LIKE ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, '%'+search+'%');
			pst.setString(2, '%'+search+'%');
			rs = pst.executeQuery();
			
			while (rs.next()) {
				String fest_name = rs.getString("fest_name");
				String city = rs.getString("city");
				String fest_tel = rs.getString("fest_tel");
				String fest_date1 = rs.getString("fest_date1");
				String fest_date2 = rs.getString("fest_date2");
				FestivalVO vo = new FestivalVO(fest_name, city, fest_tel, fest_date1, fest_date2);
				
				list.add(vo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	
	
}
