package controller;

import java.util.ArrayList;

import model.FestivalInformationDAO;
import model.FestivalVO;
import model.MemberDAO;
import model.MemberVO;
import model.ReviewDAO;
import model.ReviewVO;

public class Controller {
	private MemberDAO dao = new MemberDAO();
	private ReviewDAO rdao = new ReviewDAO();
	private FestivalInformationDAO fdao = new FestivalInformationDAO();

	private MemberVO loginUser;
	private MemberVO joinUser;
	private MemberVO joinMember;
	private ArrayList<FestivalVO> getList;
	private ArrayList<ReviewVO> review;
	
	public MemberVO getJoinMember() {
		return joinMember;
	}
	
	
	public MemberVO getJoinUser() {
		return joinUser;
	}

	public MemberVO getLoginUser() {
		return loginUser;
	}
	
	public ArrayList<ReviewVO> getReview() {
		review = rdao.pickOne();
		return review;
	}
	
	/*
	 * public boolean pick(ReviewVO user) { review = rdao.pickOne(user); if (review
	 * != null) { return true; } else { return false; } }
	 */
	
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


	public int update(MemberVO joinUser) {
		int cnt = dao.update(joinUser);
		return cnt;
	}
	
	public int delete(MemberVO joinUser) {
		int cnt = dao.delete(joinUser);
		return cnt;
	}
	
	
	public ArrayList<FestivalVO> getlist() {
		getList = fdao.getData();
		if (getList != null) {
			return getList;
		}
		return getList;
	}
	
	public ArrayList<FestivalVO> getlist(String city_name) {
		getList = fdao.getArea(city_name);
		if (getList != null) {
			return getList;
		}
		return getList;
	}

}
