package com.test.fapp.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@RequestMapping(value = "/addressXdmList")
	public String addressXdmList(Model model) {
		
	model.addAttribute("list", addressService.selectList());
		return "address/AddressXdmList";
	}
	
	
	@RequestMapping(value = "/addressXdmView")
	public String addressXdmView(Model model, AddressDto addressDto) {
		
	model.addAttribute("item", addressService.selecView(addressDto));
		return "address/AddressXdmItem";
	}
	
	@RequestMapping(value = "/addressXdmForm")
	public String addressXdmForm() {
		return "address/AddressXdmForm";
	}
	
	@RequestMapping(value = "/addressXmdInst")
	public String addressXmdInst(AddressDto addressDto) {
		addressService.insert(addressDto);
		return "redirect:/addressXdmList";
	}
	
	
	
	
	
}