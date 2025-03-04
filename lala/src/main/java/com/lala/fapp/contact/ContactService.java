package com.lala.fapp.contact;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	
	@Autowired
	ContactDao contactDao; 
	public List<ContactDto> selectList() {
		return contactDao.selectList();
	}
	
	public ContactDto selectOne(ContactDto contactDto) {
		return contactDao.selectOne(contactDto);
	}
}
