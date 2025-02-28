package com.lala.fapp.contactaddress;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactAddressDao {
	
	public List<ContactAddressDto> selectList(); 
	
}
