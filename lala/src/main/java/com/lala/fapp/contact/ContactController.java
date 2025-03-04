package com.lala.fapp.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "/contact/contactXdmList")
	public String contactXdmList(Model model) {
		model.addAttribute("contact", contactService.selectList());
		
		return "contact/contactXdmList";
	}
	
	@RequestMapping(value = "/contact/contactXdmItem")
	public String contactXdmItem(Model model, ContactDto contactDto) {
		model.addAttribute("contactItem", contactService.selectOne(contactDto));
		return "contact/contactXdmItem";
	}
	
}
