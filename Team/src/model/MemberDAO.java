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
			String sql = "SELECT * FROM FESTIVALMEMBER WHERE ID = ? AND PW = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			pst.setString(2, user.getPw());
			rs = pst.executeQuery();

			if (rs.next()) {
				String id = rs.getString("ID");
				String pw = rs.getString("PW");
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
			String sql = "SELECT * FROM FESTIVALMEMBER WHERE ID = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();

			if (rs.next()) {
				check_ID = rs.getString("ID");
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
			String sql = "SELECT * FROM FESTIVALMEMBER WHERE PW = ?";
			pst = conn.prepareStatement(sql);
			//pst.setString(1, member.getId());
			pst.setString(1, member.getPw());
			/*
			 * pst.setString(3, member.getName()); pst.setString(4, member.getPhone());
			 * pst.setString(5, member.getlocation()); pst.setString(6, member.getSex());
			 * pst.setString(7, member.getAge());
			 */
			rs = pst.executeQuery();
			
			
			if (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("PW");
				String name = rs.getString("name");
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
}
