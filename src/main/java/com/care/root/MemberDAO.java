package com.care.root;

import org.springframework.stereotype.Repository;

@Repository //("d123")//bean�̸� ����
public class MemberDAO {
	public MemberDAO() {
		System.out.println("member dao");
	}
	public void test() {
		System.out.println("dao test����");
	}
	public MemberDTO result() {
		MemberDTO dto = new MemberDTO();
		dto.setId("aaaa");
		dto.setName("ȫ�浿");
		return dto;
	}
}
