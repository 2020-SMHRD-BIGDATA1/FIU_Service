package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FestivalInformationDAO {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

	public String getList(String name) {
		String list = new String();
		getConnection();

		try {
			String sql = "select * from FESTIVAL_INFORMATION WHERE FEST_NAME = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();

			if (rs.next()) {
				list = rs.getString("FEST_CONTENTS");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}

	public String getPlace(String name) {
		String place = new String();
		getConnection();

		try {
			String sql = "select * from FESTIVAL_INFORMATION WHERE FEST_NAME = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();

			if (rs.next()) {
				place = rs.getString("FEST_PLACE");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return place;
	}

	public String getInfor(String name) {
		String infor = new String();
		getConnection();

		try {
			String sql = "select * from FESTIVAL_INFORMATION WHERE FEST_NAME = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();

			if (rs.next()) {
				infor = rs.getString("FEST_CONTENTS2");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return infor;
	}
	
	
	public ArrayList<String> getReview(String f_name) {
		ArrayList<String> review = new ArrayList<String>();
		getConnection();
		
		try {
			String sql = "select * from FESTIVAL_REVIEW WHERE FEST_NAME = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, f_name);
			rs = pst.executeQuery();
			while(rs.next()) {
				review.add(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	
	return review;
	}
	
	public ArrayList<FestivalVO> getData() {
		ArrayList<FestivalVO> list = new ArrayList<FestivalVO>();
		getConnection();
		try {
			String sql = "SELECT * FROM FESTIVAL_INFORMATION ORDER BY FEST_DATE1 ASC";
			pst = conn.prepareStatement(sql);
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
	
	public ArrayList<FestivalVO> getArea(String city_name) {
		ArrayList<FestivalVO> list = new ArrayList<FestivalVO>();
		getConnection();
		try {
			String sql = "SELECT * FROM FESTIVAL_INFORMATION WHERE CITY = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, city_name);
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
