package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReviewDAO {
	
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

	public ArrayList<ReviewVO> pickOne() {
		ArrayList<ReviewVO> list = new ArrayList<ReviewVO> ();
		ReviewVO review = null;
		getConnection();
		try {
			String sql = "SELECT * FROM FESTIVAL_REVIEW";
			pst = conn.prepareStatement(sql);
			
			rs = pst.executeQuery();

			while (rs.next()) {
				String rev_no = rs.getString("rev_no");		// 후기번호
				String fest_name = rs.getString("fest_name");	// 지역
				String rev_con = rs.getString("rev_con");	// 후기
				String age = rs.getString("age");			// 연령
				String rev_score = rs.getString("rev_score");	// 평점
				String rev_date = rs.getString("rev_date");
				review = new ReviewVO(rev_no, fest_name, rev_con, age, rev_score, rev_date);
				list.add(review);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	

}
