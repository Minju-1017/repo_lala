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
	
	public int insert(ContactEmailDto contactEmailDto) {
		return contactEmailDao.insert(contactEmailDto);
	}
	
	public int update(ContactEmailDto contactEmailDto) {
		return contactEmailDao.update(contactEmailDto);
	}

	public int delete(ContactEmailDto contactEmailDto) {
		return contactEmailDao.delete(contactEmailDto);
	}

	public int uelete(ContactEmailDto contactEmailDto) {
		return contactEmailDao.uelete(contactEmailDto);
	}
}
