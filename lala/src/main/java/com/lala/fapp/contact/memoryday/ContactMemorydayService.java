package com.lala.fapp.contact.memoryday;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMemorydayService {
	
	@Autowired
	ContactMemorydayDao contactMemorydayDao; 
	
	public List<ContactMemorydayDto> selectList() {
		return contactMemorydayDao.selectList();
	}
	
	public ContactMemorydayDto selectOne(ContactMemorydayDto contactMemorydayDto) {
		return contactMemorydayDao.selectOne(contactMemorydayDto);
	}
	
	public int insert(ContactMemorydayDto contactMemorydayDto) {
		return contactMemorydayDao.insert(contactMemorydayDto);
	}
}
