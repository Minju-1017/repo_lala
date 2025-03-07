package com.lala.fapp.contact.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactPhoneController {

	@Autowired
	ContactPhoneService contactPhoneService;
	
	@RequestMapping(value = "/contact/Phone/contactPhoneXdmList")
	public String contactPhoneXdmList(Model model) {
		model.addAttribute("contactPhone", contactPhoneService.selectList());
		
		return "contact/phone/contactPhoneXdmList";
	}
	
	@RequestMapping(value = "/contact/phone/contactPhoneXdmItem")
	public String contactPhoneXdmItem(Model model, ContactPhoneDto contactPhoneDto) {
		model.addAttribute("contactPhoneItem", contactPhoneService.selectOne(contactPhoneDto));
		
		return "contact/phone/contactPhoneXdmItem";
	}
	
	@RequestMapping(value = "/contact/phone/contactPhoneXdmForm")
	public String contactPhoneXdmForm() {
		return "contact/phone/contactPhoneXdmForm";
	}
	
	@RequestMapping(value = "/contact/phone/contactPhoneXdmInst")
	public String contactPhoneXdmInst(ContactPhoneDto contactPhoneDto) {
		contactPhoneService.insert(contactPhoneDto);
		return "redirect:/contact/Phone/contactPhoneXdmList";
	}
	
	@RequestMapping(value = "/contact/phone/contactPhoneXdmMfom")
	public String contactPhoneXdmMfom(Model model, ContactPhoneDto contactPhoneDto) {
		model.addAttribute("contactPhoneItem", contactPhoneService.selectOne(contactPhoneDto));
		
		return "contact/phone/contactPhoneXdmMfom";
	}
	
	@RequestMapping(value = "/contact/phone/contactPhoneXdmUpdt")
	public String contactPhoneXdmUpdt(ContactPhoneDto contactPhoneDto) {
		contactPhoneService.update(contactPhoneDto);
		return "redirect:/contact/Phone/contactPhoneXdmList";
	}
	
	@RequestMapping(value = "/contact/phone/contactPhoneXdmDele")
	public String contactPhoneXdmDele(ContactPhoneDto contactPhoneDto) {
		contactPhoneService.delete(contactPhoneDto);
		return "redirect:/contact/Phone/contactPhoneXdmList";
	}
	
	@RequestMapping(value = "/contact/phone/contactPhoneXdmUele")
	public String contactPhoneXdmUele(ContactPhoneDto contactPhoneDto) {
		contactPhoneService.uelete(contactPhoneDto);
		return "redirect:/contact/Phone/contactPhoneXdmList";
	}
	
}
