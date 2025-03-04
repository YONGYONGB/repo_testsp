package com.test.fapp.homepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomepageController {

	@Autowired
	HomepageService homepageService;
	
	@RequestMapping(value = "homepageXdmList")
	public String homepageXdmList(Model model) {
		model.addAttribute("list", homepageService.selectList());
		return "homepage/HomepageXdmList";
	}
	@RequestMapping(value = "homepageXdmItem")
	public String homepageXdmItem(Model model,HomepageDto homepageDto) {
		model.addAttribute("item", homepageService.selectItem(homepageDto));
		return "homepage/HomepageXdmItem";
	}
	
}
