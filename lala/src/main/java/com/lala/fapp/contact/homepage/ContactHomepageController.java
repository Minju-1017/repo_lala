package com.lala.fapp.contact.homepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactHomepageController {

	@Autowired
	ContactHomepageService contactHomepageService;
	
	@RequestMapping(value = "/contact/homepage/contactHomepageXdmList")
	public String contactHomepageXdmList(Model model) {
		model.addAttribute("contactHomepage", contactHomepageService.selectList());
		
		return "contact/homepage/contactHomepageXdmList";
	}
	
	@RequestMapping(value = "/contact/homepage/contactHomepageXdmItem")
	public String contactHomepageXdmItem(Model model, ContactHomepageDto contactHomepageDto) {
		model.addAttribute("contactHomepageItem", contactHomepageService.selectOne(contactHomepageDto));
		
		return "contact/homepage/contactHomepageXdmItem";
	}
	
	@RequestMapping(value = "/contact/homepage/contactHomepageXdmForm")
	public String contactHomepageXdmForm() {
		return "contact/homepage/contactHomepageXdmForm";
	}
	
	@RequestMapping(value = "/contact/homepage/contactHomepageXdmInst")
	public String contactHomepageXdmInst(ContactHomepageDto contactHomepageDto) {
		contactHomepageService.insert(contactHomepageDto);
		
		return "redirect:/contact/homepage/contactHomepageXdmList";
	}
	
	@RequestMapping(value = "/contact/homepage/contactHomepageXdmMfom")
	public String contactHomepageXdmMfom(Model model, ContactHomepageDto contactHomepageDto) {
		model.addAttribute("contactHomepageItem", contactHomepageService.selectOne(contactHomepageDto));
		
		return "contact/homepage/contactHomepageXdmMfom";
	}
	
	@RequestMapping(value = "/contact/homepage/contactHomepageXdmUpdt")
	public String contactHomepageXdmUpdt(ContactHomepageDto contactHomepageDto) {
		contactHomepageService.update(contactHomepageDto);
		
		return "redirect:/contact/homepage/contactHomepageXdmList";
	}
	
	@RequestMapping(value = "/contact/homepage/contactHomepageXdmDele")
	public String contactHomepageXdmDele(ContactHomepageDto contactHomepageDto) {
		contactHomepageService.delete(contactHomepageDto);
		
		return "redirect:/contact/homepage/contactHomepageXdmList";
	}
	
	@RequestMapping(value = "/contact/homepage/contactHomepageXdmUele")
	public String contactHomepageXdmUele(ContactHomepageDto contactHomepageDto) {
		contactHomepageService.uelete(contactHomepageDto);
		
		return "redirect:/contact/homepage/contactHomepageXdmList";
	}
	
}
