package com.lala.fapp.contact.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactAddressController {

	@Autowired
	ContactAddressService contactAddressService;
	
	@RequestMapping(value = "/contact/address/contactAddressXdmList")
	public String contactAddressXdmList(Model model) {
		model.addAttribute("contactAddress", contactAddressService.selectList());
		
		return "contact/address/contactAddressXdmList";
	}
	
	@RequestMapping(value = "/contact/address/contactAddressXdmItem")
	public String contactAddressXdmItem(Model model, ContactAddressDto contactAddressDto) {
		model.addAttribute("contactAddressItem", contactAddressService.selectOne(contactAddressDto));
		
		return "contact/address/contactAddressXdmItem";
	}
	
	@RequestMapping(value = "/contact/address/contactAddressXdmForm")
	public String contactAddressXdmForm() {
		return "contact/address/contactAddressXdmForm";
	}
	
	@RequestMapping(value = "/contact/address/contactAddressXdmInst")
	public String contactAddressXdmInst(ContactAddressDto contactAddressDto) {
		contactAddressService.insert(contactAddressDto);
		
		return "redirect:/contact/address/contactAddressXdmList";
	}
	
	@RequestMapping(value = "/contact/address/contactAddressXdmMfom")
	public String contactAddressXdmMfom(Model model, ContactAddressDto contactAddressDto) {
		model.addAttribute("contactAddressItem", contactAddressService.selectOne(contactAddressDto));
		
		return "contact/address/contactAddressXdmMfom";
	}
	
	@RequestMapping(value = "/contact/address/contactAddressXdmUpdt")
	public String contactAddressXdmUpdt(ContactAddressDto contactAddressDto) {
		contactAddressService.update(contactAddressDto);
		
		return "redirect:/contact/address/contactAddressXdmList";
	}
	
	@RequestMapping(value = "/contact/address/contactAddressXdmDele")
	public String contactAddressXdmDele(ContactAddressDto contactAddressDto) {
		contactAddressService.delete(contactAddressDto);
		
		return "redirect:/contact/address/contactAddressXdmList";
	}
	
	@RequestMapping(value = "/contact/address/contactAddressXdmUele")
	public String contactAddressXdmUele(ContactAddressDto contactAddressDto) {
		contactAddressService.uelete(contactAddressDto);
		
		return "redirect:/contact/address/contactAddressXdmList";
	}
	
}
