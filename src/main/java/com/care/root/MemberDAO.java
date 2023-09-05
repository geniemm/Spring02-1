package com.care.root;

import org.springframework.stereotype.Repository;

@Repository //("d123")//bean이름 지정
public class MemberDAO {
	public MemberDAO() {
		System.out.println("member dao");
	}
	public void test() {
		System.out.println("dao test실행");
	}
	public MemberDTO result() {
		MemberDTO dto = new MemberDTO();
		dto.setId("aaaa");
		dto.setName("홍길동");
		return dto;
	}
}
