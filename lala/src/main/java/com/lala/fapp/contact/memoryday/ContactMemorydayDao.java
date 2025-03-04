package com.lala.fapp.contact.memoryday;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactMemorydayDao {
	
	public List<ContactMemorydayDto> selectList(); 
	public ContactMemorydayDto selectOne(ContactMemorydayDto contactMemorydayDto); 
	
}
