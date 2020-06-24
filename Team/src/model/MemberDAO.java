package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
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

	public MemberVO selectOne(MemberVO user) {
		
		MemberVO loginuser = null;
		getConnection();
		try {
			String sql = "SELECT * FROM FESTIVALMEMBER WHERE FEST_ID = ? AND FEST_PW = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			pst.setString(2, user.getPw());
			rs = pst.executeQuery();

			if (rs.next()) {
				String id = rs.getString("FEST_ID");
				String pw = rs.getString("FEST_PW");
				loginuser = new MemberVO(id, pw);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return loginuser;
	}

	public int insert(MemberVO joinUser) {
		int row = 0;
		getConnection();
		try {
			String sql = "INSERT INTO FESTIVALMEMBER VALUES(?,?,?,?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, joinUser.getId());
			pst.setString(2, joinUser.getPw());
			pst.setString(3, joinUser.getName());
			pst.setString(4, joinUser.getPhone());
			pst.setString(5, joinUser.getlocation());
			pst.setString(6, joinUser.getSex());
			pst.setString(7, joinUser.getAge());
			row = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return row;
	}

	public String selectCheck(String id) {
		String check_ID = null;
		getConnection();
		try {
			String sql = "SELECT * FROM FESTIVALMEMBER WHERE FEST_ID = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();

			if (rs.next()) {
				check_ID = rs.getString("FEST_ID");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return check_ID;
	}
	
	public MemberVO select(MemberVO member) {
		MemberVO joinMember = null;
		getConnection();
		try {
			String sql = "SELECT * FROM FESTIVALMEMBER WHERE FEST_ID = ?";
			pst = conn.prepareStatement(sql);
			//pst.setString(1, member.getId());
			pst.setString(1, member.getId());
			/*
			 * pst.setString(3, member.getName()); pst.setString(4, member.getPhone());
			 * pst.setString(5, member.getlocation()); pst.setString(6, member.getSex());
			 * pst.setString(7, member.getAge());
			 */
			rs = pst.executeQuery();
			
			
			if (rs.next()) {
				String id = rs.getString("FEST_ID");
				String pw = rs.getString("FEST_PW");
				String name = rs.getString("MEMBER_NAME");
				String phone = rs.getString("phone");
				String location = rs.getString("location");
				String sex = rs.getString("sex");
				String age = rs.getString("age");

				joinMember = new MemberVO (id, pw, name, phone, location, sex, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return joinMember;
	}
	
	public int update(MemberVO update) {
		int cnt = 0;
		MemberVO updatemember = null;
		getConnection();
		try {
			String sql = "UPDATE FESTIVALMEMBER SET FEST_ID = ?, FEST_PW = ?, MEMBER_NAME = ?, PHONE = ?, LOCATION = ?, SEX = ?, AGE = ? Where FEST_ID = ? ";
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, update.getId());
			pst.setString(2, update.getPw());
			pst.setString(3, update.getName());
			pst.setString(4, update.getPhone());
			pst.setString(5, update.getlocation());
			pst.setString(6, update.getSex());
			pst.setString(7, update.getAge());	
			pst.setString(8, update.getId());
			
			cnt = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	
	public int delete(MemberVO delete) {
		int cnt = 0;
		MemberVO deletemember = null;
		getConnection();
		try {
			String sql = "DELETE FESTIVALMEMBER Where FEST_ID = ? ";
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, delete.getId());
			
			cnt = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	
	}
	
	

