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
	
	@RequestMapping(value = "/contact/contactXdmForm")
	public String contactXdmForm() {
		return "contact/contactXdmForm";
	}
	
	@RequestMapping(value = "/contact/contactXdmInst")
	public String contactXdmInst(ContactDto contactDto) {
		System.out.println("contactDto.getSeq(): " + contactDto.getSeq()); 
		System.out.println("contactDto.getLastName(): " + contactDto.getLastName());
		System.out.println("contactDto.getFirstName(): " + contactDto.getFirstName());
		System.out.println("contactDto.getId(): " + contactDto.getId());
		System.out.println("contactDto.getNickname(): " + contactDto.getNickname());
		System.out.println("contactDto.getMemo(): " + contactDto.getMemo());
		
		contactService.insert(contactDto);
		
		System.out.println("contactDto.getSeq(): " + contactDto.getSeq()); 
		
		return "redirect:/contact/contactXdmList";
	}
	
	@RequestMapping(value = "/contact/contactXdmMfom")
	public String contactXdmMfom(Model model, ContactDto contactDto) {
		System.out.println("contactDto.getSeq(): " + contactDto.getSeq()); 
		System.out.println("contactDto.getLastName(): " + contactDto.getLastName());
		System.out.println("contactDto.getFirstName(): " + contactDto.getFirstName());
		System.out.println("contactDto.getId(): " + contactDto.getId());
		System.out.println("contactDto.getNickname(): " + contactDto.getNickname());
		System.out.println("contactDto.getMemo(): " + contactDto.getMemo());
		
		model.addAttribute("contactItem", contactService.selectOne(contactDto));
		
		return "contact/contactXdmMfom";
	}
	
	@RequestMapping(value = "/contact/contactXdmUpdt")
	public String contactXdmUpdt(ContactDto contactDto) {
		contactService.update(contactDto);
		
		return "redirect:/contact/contactXdmList";
	}
	
}
