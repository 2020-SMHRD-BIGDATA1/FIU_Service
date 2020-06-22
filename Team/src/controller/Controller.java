package controller;

import model.MemberDAO;
import model.MemberVO;

public class Controller {
	private MemberDAO dao = new MemberDAO();
	private MemberVO loginUser;

	public MemberVO getLoginUser() {
		return loginUser;
	}

	public boolean login(MemberVO user) {
		loginUser = dao.selectOne(user);
		if (loginUser != null) {
			return true;
		} else {
			return false;
		}
	}

	public int join(MemberVO joinUser) {
		int cnt = dao.insert(joinUser);
		return cnt;
	}
}
