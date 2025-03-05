package com.lala.fapp.contact.msgsns;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMsgsnsService {
	
	@Autowired
	ContactMsgsnsDao contactMsgsnsDao; 
	
	public List<ContactMsgsnsDto> selectList() {
		return contactMsgsnsDao.selectList();
	}
	
	public ContactMsgsnsDto selectOne(ContactMsgsnsDto contactMsgsnsDto) {
		return contactMsgsnsDao.selectOne(contactMsgsnsDto);
	}
	
	public int insert(ContactMsgsnsDto contactMsgsnsDto) {
		return contactMsgsnsDao.insert(contactMsgsnsDto);
	}
}
