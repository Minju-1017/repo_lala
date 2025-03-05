package com.lala.fapp.contact.memoryday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactMemorydayController {

	@Autowired
	ContactMemorydayService contactMemorydayService;
	
	@RequestMapping(value = "/contact/memoryday/contactMemorydayXdmList")
	public String contactMemorydayXdmList(Model model) {
		model.addAttribute("contactMemoryday", contactMemorydayService.selectList());
		
		return "contact/memoryday/contactMemorydayXdmList";
	}
	
	@RequestMapping(value = "/contact/memoryday/contactMemorydayXdmItem")
	public String contactMemorydayXdmItem(Model model, ContactMemorydayDto contactMemorydayDto) {
		model.addAttribute("contactMemorydayItem", contactMemorydayService.selectOne(contactMemorydayDto));
		
		return "contact/memoryday/contactMemorydayXdmItem";
	}
	
	@RequestMapping(value = "/contact/memoryday/contactMemorydayXdmForm")
	public String contactMemorydayXdmForm() {
		return "contact/memoryday/contactMemorydayXdmForm";
	}
	
	@RequestMapping(value = "/contact/memoryday/contactMemorydayXdmInst")
	public String contactMemorydayXdmInst(ContactMemorydayDto contactMemorydayDto) {
		contactMemorydayService.insert(contactMemorydayDto);
		return "redirect:/contact/memoryday/contactMemorydayXdmList";
	}
	
}
