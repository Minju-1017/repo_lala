package com.lala.fapp.contact.grouplist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactGroupListController {

	@Autowired
	ContactGroupListService contactGroupListService;
	
	@RequestMapping(value = "/contact/grouplist/contactGroupListXdmList")
	public String contactGroupListXdmList(Model model) {
		model.addAttribute("contactGroupList", contactGroupListService.selectList());
		
		return "contact/grouplist/contactGroupListXdmList";
	}
	
	@RequestMapping(value = "/contact/grouplist/contactGroupListXdmItem")
	public String contactGroupListXdmItem(Model model, ContactGroupListDto contactGroupListDto) {
		model.addAttribute("contactGroupListItem", contactGroupListService.selectOne(contactGroupListDto));
		
		return "contact/grouplist/contactGroupListXdmItem";
	}
	
	@RequestMapping(value = "/contact/grouplist/contactGroupListXdmForm")
	public String contactGroupListXdmForm() {
		return "contact/grouplist/contactGroupListXdmForm";
	}
	
	@RequestMapping(value = "/contact/grouplist/contactGroupListXdmInst")
	public String contactGroupListXdmInst(ContactGroupListDto contactGroupListDto) {
		contactGroupListService.insert(contactGroupListDto);
		return "redirect:/contact/grouplist/contactGroupListXdmList";
	}
	
	@RequestMapping(value = "/contact/grouplist/contactGroupListXdmMfom")
	public String contactGroupListXdmMfom(
			Model model, ContactGroupListDto contactGroupListDto) {
		model.addAttribute("contactGroupListItem", contactGroupListService.selectOne(contactGroupListDto));
		
		return "contact/grouplist/contactGroupListXdmMfom";
		
	}
	
	@RequestMapping(value = "/contact/grouplist/contactGroupListXdmUpdt")
	public String contactGroupListXdmUpdt(ContactGroupListDto contactGroupListDto) {
		contactGroupListService.update(contactGroupListDto);
		
		return "redirect:/contact/grouplist/contactGroupListXdmList";
	}
	
}
