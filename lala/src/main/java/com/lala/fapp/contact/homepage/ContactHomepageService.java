package com.lala.fapp.contact.homepage;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactHomepageService {
	
	@Autowired
	ContactHomepageDao contactHomepageDao; 
	
	public List<ContactHomepageDto> selectList() {
		return contactHomepageDao.selectList();
	}
	
	public ContactHomepageDto selectOne(ContactHomepageDto contactHomepageDto) {
		return contactHomepageDao.selectOne(contactHomepageDto);
	}
	
	public int insert(ContactHomepageDto contactHomepageDto) {
		return contactHomepageDao.insert(contactHomepageDto);
	}
}
