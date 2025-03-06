package com.lala.fapp.contact.phone;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactPhoneDao {
	
	public List<ContactPhoneDto> selectList(); 
	public ContactPhoneDto selectOne(ContactPhoneDto contactPhoneDto); 
	public int insert(ContactPhoneDto contactPhoneDto);
	public int update(ContactPhoneDto contactPhoneDto);
	
}
