package com.lala.fapp.contact.memoryday;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactMemorydayDao {
	
	public List<ContactMemorydayDto> selectList(); 
	public ContactMemorydayDto selectOne(ContactMemorydayDto contactMemorydayDto); 
	public int insert(ContactMemorydayDto contactMemorydayDto);
	public int update(ContactMemorydayDto contactMemorydayDto);
	public int delete(ContactMemorydayDto contactMemorydayDto);
	public int uelete(ContactMemorydayDto contactMemorydayDto);
	
}
