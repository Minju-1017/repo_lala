package com.lala.fapp.contact.grouplist;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactGroupListService {
	
	@Autowired
	ContactGroupListDao contactGroupListDao; 
	
	public List<ContactGroupListDto> selectList() {
		return contactGroupListDao.selectList();
	}
	
	public ContactGroupListDto selectOne(ContactGroupListDto contactGroupListDto) {
		return contactGroupListDao.selectOne(contactGroupListDto);
	}
	
	public int insert(ContactGroupListDto contactGroupListDto) {
		return contactGroupListDao.insert(contactGroupListDto);
	}
	
	public int update(ContactGroupListDto contactGroupListDto) {
		return contactGroupListDao.update(contactGroupListDto);
	}
	
	public int delete(ContactGroupListDto contactGroupListDto) {
		return contactGroupListDao.delete(contactGroupListDto);
	}
	
	public int uelete(ContactGroupListDto contactGroupListDto) {
		return contactGroupListDao.uelete(contactGroupListDto);
	}
}
