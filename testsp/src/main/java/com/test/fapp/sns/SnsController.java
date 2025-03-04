package com.test.fapp.sns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SnsController {

	@Autowired
	SnsService snsService;
	
	@RequestMapping(value ="snsXdmList")
	public String snsXdmList(Model model) {
		model.addAttribute("list", snsService.selectList());
		return "sns/SnsXdmList";
	}
	@RequestMapping(value ="snsXdmItem")
	public String snsXdmItem(Model model, SnsDto snsDto) {
		model.addAttribute("item", snsService.selectItem(snsDto));
		return "sns/SnsXdmItem";
	}
	
}
