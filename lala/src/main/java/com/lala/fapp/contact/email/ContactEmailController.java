package com.lala.fapp.contact.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactEmailController {

	@Autowired
	ContactEmailService contactEmailService;
	
	@RequestMapping(value = "/contact/email/contactEmailXdmList")
	public String contactEmailXdmList(Model model) {
		model.addAttribute("contactEmail", contactEmailService.selectList());
		
		return "contact/email/contactEmailXdmList";
	}
	
	@RequestMapping(value = "/contact/email/contactEmailXdmItem")
	public String contactEmailXdmItem(Model model, ContactEmailDto contactEmailDto) {
		model.addAttribute("contactEmailItem", contactEmailService.selectOne(contactEmailDto));
		
		return "contact/email/contactEmailXdmItem";
	}
	
	@RequestMapping(value = "/contact/email/contactEmailXdmForm")
	public String contactEmailXdmForm() {
		return "contact/email/contactEmailXdmForm";
	}
	
	@RequestMapping(value = "/contact/email/contactEmailXdmInst")
	public String contactEmailXdmInst(ContactEmailDto contactEmailDto) {
		contactEmailService.insert(contactEmailDto);
		return "redirect:/contact/email/contactEmailXdmList";
	}
	
}
