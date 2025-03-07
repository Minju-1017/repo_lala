package com.lala.fapp.contact.grouplist;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactGroupListDao {
	
	public List<ContactGroupListDto> selectList(); 
	public ContactGroupListDto selectOne(ContactGroupListDto contactGroupListDto); 
	public int insert(ContactGroupListDto contactGroupListDto); 
	public int update(ContactGroupListDto contactGroupListDto); 
	public int delete(ContactGroupListDto contactGroupListDto); 
	public int uelete(ContactGroupListDto contactGroupListDto); 
	
}
