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
	
	public int insert(ContactDto contactDto) {
		return contactDao.insert(contactDto);
	}
	
	public int update(ContactDto contactDto) {
		return contactDao.update(contactDto);
	}
	
	public int delete(ContactDto contactDto) {
		return contactDao.delete(contactDto);
	}
	
	public int uelete(ContactDto contactDto) {
		return contactDao.uelete(contactDto);
	}
}
