package com.test.fapp.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmailController {

	@Autowired
	EmailService emailService;
	
	@RequestMapping(value = "/emailXdmList")
	public String emailXdmList(Model model) {
		model.addAttribute("list", emailService.selectList());
		return "email/EmailXdmList";
	}
	
	@RequestMapping(value = "/emailXdmItem")
	public String emailXdmItem(Model model, EmailDto emailDto) {
		model.addAttribute("item", emailService.selectItem(emailDto));
		return "email/EmailXdmItem";
	}
	
}
