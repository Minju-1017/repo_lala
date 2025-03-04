package com.lala.fapp.contact.email;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactEmailService {
	
	@Autowired
	ContactEmailDao contactEmailDao; 
	
	public List<ContactEmailDto> selectList() {
		return contactEmailDao.selectList();
	}
	
	public ContactEmailDto selectOne(ContactEmailDto contactEmailDto) {
		return contactEmailDao.selectOne(contactEmailDto);
	}
}
