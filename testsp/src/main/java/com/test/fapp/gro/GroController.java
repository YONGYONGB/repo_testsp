package com.test.fapp.gro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GroController {

	@Autowired
	GroService groService;
	
	@RequestMapping(value = "groXdmList")
	public String groXdmList(Model model) {
		model.addAttribute("list", groService.selectList());
		return "gro/GroXdmList";
	}
	@RequestMapping(value = "groXdmItem")
	public String groXdmItem(Model model, GroDto groDto) {
		model.addAttribute("item", groService.selectItem(groDto));
		return "gro/GroXdmItem";
	}
	
}
