package com.lala.fapp.contact.affiliation;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactAffiliationDao {
	
	public List<ContactAffiliationDto> selectList(); 
	public ContactAffiliationDto selectOne(ContactAffiliationDto contactAffiliationDto); 
	public int insert(ContactAffiliationDto contactAffiliationDto);
	public int update(ContactAffiliationDto contactAffiliationDto);
	public int delete(ContactAffiliationDto contactAffiliationDto);
	public int uelete(ContactAffiliationDto contactAffiliationDto);
	
}
