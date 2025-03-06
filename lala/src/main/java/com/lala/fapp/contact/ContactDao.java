package com.lala.fapp.contact;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao {
	
	public List<ContactDto> selectList();
	public ContactDto selectOne(ContactDto contactDto); 
	public int insert(ContactDto contactDto); 
	public int update(ContactDto contactDto);
}
