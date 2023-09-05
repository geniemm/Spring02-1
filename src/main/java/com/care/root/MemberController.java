package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	// bean을 자동으로 주입하고싶으면 @Autowired 추가
	@Autowired
	private MemberService ms;
	
	public MemberController() {
		System.out.println("controller");
	}
	
	@GetMapping("/index") //url경로
	public String index() {
		System.out.println(ms); // null값이면 기능을 못써~~
		ms.test();
		return "index";	//views -> jsp경로
	}
	@GetMapping("/result")
	public String result(Model model) {
		model.addAttribute("member",ms.result());
		return "result";
	}
}
