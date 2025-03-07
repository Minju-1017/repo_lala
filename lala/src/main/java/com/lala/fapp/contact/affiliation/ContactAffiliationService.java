package com.lala.fapp.contact.affiliation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactAffiliationService {
	
	@Autowired
	ContactAffiliationDao contactAffiliationDao; 
	
	public List<ContactAffiliationDto> selectList() {
		return contactAffiliationDao.selectList();
	}
	
	public ContactAffiliationDto selectOne(ContactAffiliationDto contactAffiliationDto) {
		return contactAffiliationDao.selectOne(contactAffiliationDto);
	}
	
	public int insert(ContactAffiliationDto contactAffiliationDto) {
		return contactAffiliationDao.insert(contactAffiliationDto);
	}
	
	public int update(ContactAffiliationDto contactAffiliationDto) {
		return contactAffiliationDao.update(contactAffiliationDto);
	}
	

	public int delete(ContactAffiliationDto contactAffiliationDto) {
		return contactAffiliationDao.delete(contactAffiliationDto);
	}
	
	public int uelete(ContactAffiliationDto contactAffiliationDto) {
		return contactAffiliationDao.uelete(contactAffiliationDto);
	}
}
