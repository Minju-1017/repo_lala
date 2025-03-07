package com.lala.fapp.contact.phone;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactPhoneService {
	
	@Autowired
	ContactPhoneDao contactPhoneDao; 
	
	public List<ContactPhoneDto> selectList() {
		return contactPhoneDao.selectList();
	}
	
	public ContactPhoneDto selectOne(ContactPhoneDto contactPhoneDto) {
		return contactPhoneDao.selectOne(contactPhoneDto);
	}
	
	public int insert(ContactPhoneDto contactPhoneDto) {
		return contactPhoneDao.insert(contactPhoneDto);
	}
	
	public int update(ContactPhoneDto contactPhoneDto) {
		return contactPhoneDao.update(contactPhoneDto);
	}
	
	public int delete(ContactPhoneDto contactPhoneDto) {
		return contactPhoneDao.delete(contactPhoneDto);
	}
	
	public int uelete(ContactPhoneDto contactPhoneDto) {
		return contactPhoneDao.uelete(contactPhoneDto);
	}
}
