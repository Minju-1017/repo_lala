package com.lala.fapp.contact.msgsns;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactMsgsnsDao {
	
	public List<ContactMsgsnsDto> selectList(); 
	public ContactMsgsnsDto selectOne(ContactMsgsnsDto contactMsgsnsDto); 
	
}
