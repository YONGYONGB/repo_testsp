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
	
	@RequestMapping(value = "/ContactAddressXdmView")
	public String ContactAddressXdmView(Model model, ContactAddressDto contactAddressDto) {
		model.addAttribute("item", contactAddressService.selectView(contactAddressDto));
		return "contact/ContactAddressItem";
	}
	@RequestMapping(value = "/ContactAddressXdmForm")
	public String ContactAddressXdmForm() {
		return "contact/ContactAddressXdmForm";
	}
	
	
	@RequestMapping(value = "/ContactAddressXdmInst")
	public String ContactAddressXdmInst(ContactAddressDto contactAddressDto) {
		contactAddressService.insert(contactAddressDto);
		return "redirect:/ContactAddressXdmList";
	}
	
}
