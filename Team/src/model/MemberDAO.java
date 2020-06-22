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
}
