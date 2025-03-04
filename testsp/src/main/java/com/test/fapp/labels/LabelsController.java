package com.test.fapp.labels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LabelsController {

	
	@Autowired
	LabelsService labelsService;
	
	@RequestMapping(value = "labelsXdmList")
	public String labelsXdmList(Model model) {
		model.addAttribute("list", labelsService.selectList());
		return "labels/LabelsXdmList";
	}
	@RequestMapping(value = "labelsXdmItem")
	public String labelsXdmItem(Model model, LabelsDto labelsDto) {
		model.addAttribute("item", labelsService.selectItem(labelsDto));
		return "labels/LabelsXdmItem";
	}
	
}
