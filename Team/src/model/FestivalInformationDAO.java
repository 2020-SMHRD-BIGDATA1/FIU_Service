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
			pst= conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				list = rs.getString("FEST_CONTENTS");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
//		ArrayList<String> list = new ArrayList<String>();
//		getConnection();
//		
//		String sql = "select * from FESTIVAL_INFORMATION";
//		try {
//			pst = conn.prepareStatement(sql);
//			rs = pst.executeQuery();
//			while(rs.next()) {
//				list.add(rs.getString(7));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			close();
//		}
		

		return list;
	}
	
}
