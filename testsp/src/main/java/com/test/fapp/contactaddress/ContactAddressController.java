package com.test.fapp.contactaddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ContactAddressController {

	@Autowired
	ContactAddressService contactAddressService;
	
	@RequestMapping(value = "/ContactAddressXdmList")
	public String ContactAddressXdmList(Model model) {
		model.addAttribute("list", contactAddressService.selectList());
		return "contact/ContactAddressXdmList";
	}
	
	@RequestMapping(value = "/ContactAddressXdmItem")
	public String ContactAddressXdmItem(Model model, ContactAddressDto contactAddressDto) {
		model.addAttribute("item", contactAddressService.selectItem(contactAddressDto));
		return "contact/ContactAddressItem";
	}
	
}
