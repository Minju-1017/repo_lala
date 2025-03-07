package com.lala.fapp.contact.address;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactAddressService {
	
	@Autowired
	ContactAddressDao contactAddressDao; 
	
	public List<ContactAddressDto> selectList() {
		return contactAddressDao.selectList();
	}
	
	public ContactAddressDto selectOne(ContactAddressDto contactAddressDto) {
		return contactAddressDao.selectOne(contactAddressDto);
	}
	
	public int insert(ContactAddressDto contactAddressDto) {
		return contactAddressDao.insert(contactAddressDto);
	}
	
	public int update(ContactAddressDto contactAddressDto) {
		return contactAddressDao.update(contactAddressDto);
	}
	
	public int delete(ContactAddressDto contactAddressDto) {
		return contactAddressDao.delete(contactAddressDto);
	}
	
	public int uelete(ContactAddressDto contactAddressDto) {
		return contactAddressDao.uelete(contactAddressDto);
	}
}
