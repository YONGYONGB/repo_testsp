package com.test.fapp.day;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DayController {

	@Autowired
	DayService dayService;
	
	@RequestMapping(value = "dayXdmList")
	public String dayXdmList(Model model) {
		model.addAttribute("list",dayService.selectList());
		return "day/DayXdmList";
	}
	
	@RequestMapping(value = "dayXdmView")
	public String dayXdmView(Model model, DayDto dayDto) {
		model.addAttribute("item",dayService.selectView(dayDto));
		return "day/DayXdmItem";
	}
	
}
