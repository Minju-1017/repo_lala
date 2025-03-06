package com.lala.fapp.contact.address;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactAddressDao {
	
	public List<ContactAddressDto> selectList(); 
	public ContactAddressDto selectOne(ContactAddressDto contactAddressDto); 
	public int insert(ContactAddressDto contactAddressDto); 
	public int update(ContactAddressDto contactAddressDto);
	
}
