package com.lala.fapp.contact.homepage;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactHomepageDao {
	
	public List<ContactHomepageDto> selectList(); 
	public ContactHomepageDto selectOne(ContactHomepageDto contactHomepageDto); 
	public int insert(ContactHomepageDto contactHomepageDto); 
	public int update(ContactHomepageDto contactHomepageDto); 
	
}
