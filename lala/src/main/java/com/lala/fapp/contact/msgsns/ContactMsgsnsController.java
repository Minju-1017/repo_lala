package com.lala.fapp.contact.msgsns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lala.fapp.contact.memoryday.ContactMemorydayDto;

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
	
	@RequestMapping(value = "/contact/msgsns/contactMsgsnsXdmForm")
	public String contactMsgsnsXdmForm() {
		return "contact/msgsns/contactMsgsnsXdmForm";
	}
	
	@RequestMapping(value = "/contact/msgsns/contactMsgsnsXdmInst")
	public String contactMsgsnsXdmInst(ContactMsgsnsDto contactMsgsnsDto) {
		contactMsgsnsService.insert(contactMsgsnsDto);
		return "redirect:/contact/msgsns/contactMsgsnsXdmList";
	}
	
	@RequestMapping(value = "/contact/msgsns/contactMsgsnsXdmMfom")
	public String contactMsgsnsXdmMfom(Model model, ContactMsgsnsDto contactMsgsnsDto) {
		model.addAttribute("contactMsgsnsItem", contactMsgsnsService.selectOne(contactMsgsnsDto));
		
		return "contact/msgsns/contactMsgsnsXdmMfom";
	}
	
	@RequestMapping(value = "/contact/msgsns/contactMsgsnsXdmUpdt")
	public String contactMsgsnsXdmUpdt(ContactMsgsnsDto contactMsgsnsDto) {
		contactMsgsnsService.update(contactMsgsnsDto);
		
		return "redirect:/contact/msgsns/contactMsgsnsXdmList";
	}
	
	@RequestMapping(value = "/contact/msgsns/contactMsgsnsXdmDele")
	public String contactMsgsnsXdmDele(ContactMsgsnsDto contactMsgsnsDto) {
		contactMsgsnsService.delete(contactMsgsnsDto);
		
		return "redirect:/contact/msgsns/contactMsgsnsXdmList";
	}
	
	@RequestMapping(value = "/contact/msgsns/contactMsgsnsXdmUele")
	public String contactMsgsnsXdmUele(ContactMsgsnsDto contactMsgsnsDto) {
		contactMsgsnsService.uelete(contactMsgsnsDto);
		
		return "redirect:/contact/msgsns/contactMsgsnsXdmList";
	}
	
}
