package com.lala.fapp.contact.email;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactEmailDao {
	
	public List<ContactEmailDto> selectList(); 
	public ContactEmailDto selectOne(ContactEmailDto contactEmailDto); 
	
}
