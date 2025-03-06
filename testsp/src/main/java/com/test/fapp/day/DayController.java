package com.test.fapp.day;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class DayController {

	@Autowired
	DayService dayService;
	
	@RequestMapping(value = "/dayXdmList")
	public String dayXdmList(Model model) {
		model.addAttribute("list",dayService.selectList());
		return "day/DayXdmList";
	}
	
	@RequestMapping(value = "dayXdmView")
	public String dayXdmView(Model model, DayDto dayDto) {
		model.addAttribute("item",dayService.selectView(dayDto));
		return "day/DayXdmItem";
	}
	
	@RequestMapping(value ="dayXdmForm")
	public String dayXdmForm() {
		return "day/DayXdmForm";
	}
	
	@RequestMapping(value = "dayXdmInst")
	public String dayXdmInst(DayDto dayDto) {
		dayService.insert(dayDto);     
		return "redirect:/dayXdmList";
	}
	
	@RequestMapping(value ="dayXdmMform")
	public String dayXdmMform(Model model, DayDto dayDto) {
		model.addAttribute("item",dayService.selectView(dayDto));
		return "day/DayXdmMform";
	}
	
	@RequestMapping(value = "dayXdmUpd")
	public String dayXdmUpd(DayDto dayDto) {
		dayService.update(dayDto);      
		return "redirect:/dayXdmList";
	}
	
	
}
