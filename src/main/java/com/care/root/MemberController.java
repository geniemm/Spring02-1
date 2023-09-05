package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	// bean�� �ڵ����� �����ϰ������ @Autowired �߰�
	@Autowired
	private MemberService ms;
	
	public MemberController() {
		System.out.println("controller");
	}
	
	@GetMapping("/index") //url���
	public String index() {
		System.out.println(ms); // null���̸� ����� ����~~
		ms.test();
		return "index";	//views -> jsp���
	}
	@GetMapping("/result")
	public String result(Model model) {
		model.addAttribute("member",ms.result());
		return "result";
	}
}
