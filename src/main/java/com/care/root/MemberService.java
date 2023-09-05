package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService { // memberService의 bean이 생성됨 > ctrl에서 가져와써야지
	//@Autowired 이걸로 쓰던지 아래껄로 쓰던지 하면됨
	@Inject
	@Qualifier("ddd")
	MemberDAO dao;
	
	public MemberService() {
		System.out.println("service");
	}
	public void test() {
		System.out.println("svr test연동");
		dao.test();
	}
	public MemberDTO result() {
		return dao.result();
	}
	
}
