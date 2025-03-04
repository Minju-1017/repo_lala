package com.lala.fapp.contact.msgsns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactMsgsnsController {

	@Autowired
	ContactMsgsnsService contactMsgsnsService;
	
	@RequestMapping(value = "/contact/msgsns/contactMsgsnsXdmList")
	public String contactMsgsnsXdmList(Model model) {
		model.addAttribute("contactMsgsns", contactMsgsnsService.selectList());
		
		return "contact/msgsns/contactMsgsnsXdmList";
	}
	
	@RequestMapping(value = "/contact/msgsns/contactMsgsnsXdmItem")
	public String contactMsgsnsXdmItem(Model model, ContactMsgsnsDto contactMsgsnsDto) {
		model.addAttribute("contactMsgsnsItem", contactMsgsnsService.selectOne(contactMsgsnsDto));
		
		return "contact/msgsns/contactMsgsnsXdmItem";
	}
	
}
