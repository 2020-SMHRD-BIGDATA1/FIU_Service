package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ChartVO;


public class ChartReadCSV {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

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
	
	public ArrayList<ChartVO> getList(String f_name) {
		ArrayList<ChartVO> list = new ArrayList<ChartVO>();
		getConnection();
		
		try {
			String sql = "select * from FESTIVAL_REVIEW where fest_name = ?";
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, f_name);
			
			rs = pst.executeQuery();
			while (rs.next()) {
				int age = rs.getInt(4);
				int rating = rs.getInt(5);
				ChartVO vo = new ChartVO(age,rating);
				
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

}
