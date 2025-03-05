package com.lala.fapp.contact.affiliation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactAffiliationController {

	@Autowired
	ContactAffiliationService contactAffiliationService;
	
	@RequestMapping(value = "/contact/affiliation/contactAffiliationXdmList")
	public String contactAffiliationXdmList(Model model) {
		model.addAttribute("contactAffiliation", contactAffiliationService.selectList());
		
		return "contact/affiliation/contactAffiliationXdmList";
	}
	
	@RequestMapping(value = "/contact/affiliation/contactAffiliationXdmItem")
	public String contactAffiliationXdmItem(Model model, ContactAffiliationDto contactAffiliationDto) {
		model.addAttribute("contactAffiliationItem", contactAffiliationService.selectOne(contactAffiliationDto));
		
		return "contact/affiliation/contactAffiliationXdmItem";
	}
	
	@RequestMapping(value = "/contact/affiliation/contactAffiliationXdmForm")
	public String contactAffiliationXdmForm() {
		return "contact/affiliation/contactAffiliationXdmForm";
	}
	
	@RequestMapping(value = "/contact/affiliation/contactAffiliationXdmInst")
	public String contactAffiliationXdmInst(ContactAffiliationDto contactAffiliationDto) {
		contactAffiliationService.insert(contactAffiliationDto);
		return "redirect:/contact/affiliation/contactAffiliationXdmList";
	}
	
}
