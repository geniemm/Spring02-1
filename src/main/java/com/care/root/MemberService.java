package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService { // memberService�� bean�� ������ > ctrl���� �����ͽ����
	//@Autowired �̰ɷ� ������ �Ʒ����� ������ �ϸ��
	@Inject
	@Qualifier("ddd")
	MemberDAO dao;
	
	public MemberService() {
		System.out.println("service");
	}
	public void test() {
		System.out.println("svr test����");
		dao.test();
	}
	public MemberDTO result() {
		return dao.result();
	}
	
}
