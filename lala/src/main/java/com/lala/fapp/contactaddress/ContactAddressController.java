package com.lala.fapp.contactaddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactAddressController {

	@Autowired
	ContactAddressService contactAddressService;
	
	@RequestMapping(value = "/contactAddress/contactAddressXdmList")
	public String groupListXdmList(Model model) {
		model.addAttribute("contactAddress", contactAddressService.selectList());
		
		return "contactAddress/contactAddressXdmList";
	}
	
}
