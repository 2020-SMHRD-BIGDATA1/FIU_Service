package controller;

import model.MemberDAO;
import model.MemberVO;

public class Controller {
	private MemberDAO dao = new MemberDAO();
	private MemberVO loginUser;
	private MemberVO joinUser;
	private MemberVO joinMember;
	
	public MemberVO getJoinMember() {
		return joinMember;
	}
	
	
	public MemberVO getJoinUser() {
		return joinUser;
	}

	public MemberVO getLoginUser() {
		return loginUser;
	}
	
	public boolean member(MemberVO member) {
		joinMember = dao.select(member);
		if (joinMember != null) {
			return true;
		}else {
			return false;
		}
	}
	

	public boolean login(MemberVO user) {
		loginUser = dao.selectOne(user);
		if (loginUser != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public MemberVO select(MemberVO member) {
		joinMember = dao.select(member);
		if (joinMember != null) {
			return joinMember;
		} else {
			return null;
		}
	}
	
	
	public int join(MemberVO joinUser) {
		int cnt = dao.insert(joinUser);
		return cnt;
	}
	


	public boolean check(String id) {
		String check_ID;
		check_ID = dao.selectCheck(id);
		if (check_ID != null) {
			return true;
		} else {
			return false;
		}
	}

}
