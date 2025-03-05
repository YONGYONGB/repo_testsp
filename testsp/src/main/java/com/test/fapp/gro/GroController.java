package com.test.fapp.gro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GroController {

	@Autowired
	GroService groService;
	
	@RequestMapping(value = "groXdmList") //url 매핑
	public String groXdmList(Model model) {
		model.addAttribute("list", groService.selectList());
		return "gro/GroXdmList"; // view 매핑
	}
	
	@RequestMapping(value = "groXdmItem") // 아이템이 아니라 view임, url 매핑
	public String groXdmItem(Model model, GroDto groDto) {
		model.addAttribute("item", groService.selectItem(groDto));
		return "gro/GroXdmItem"; // view 매핑
	}

	
	@RequestMapping(value = "groXdmForm")
	public String groXdmForm() {
		return "gro/GroXdmForm";
	}
	
	@RequestMapping(value = "groXdmInst")
	public String groXdmInst(GroDto groDto) {
		
		System.out.println("groDto.getSeq()"+groDto.getSeq());
		System.out.println("groDto.getGrou()"+groDto.getGrou());
		
		groService.insert(groDto);
		System.out.println("groDto.getSeq()"+groDto.getSeq());
		
		return "redirect:/groXdmList";
	}
	
}
