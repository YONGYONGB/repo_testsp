package com.test.fapp.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@RequestMapping(value = "/addressXdmList")
	public String addressXdmList(Model model) {
		
	model.addAttribute("list", addressService.selectList());
		return "address/AddressXdmList";
	}
	
	
	@RequestMapping(value = "/addressXdmItem")
	public String addressXdmItem(Model model, AddressDto addressDto) {
		
	model.addAttribute("item", addressService.selectItem(addressDto));
		return "address/AddressXdmItem";
	}
	
	
	
	
	
	
}