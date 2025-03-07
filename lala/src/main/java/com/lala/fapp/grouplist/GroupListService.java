package com.lala.fapp.grouplist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lala.fapp.contact.ContactDto;

@Service // Service의 필수 어노테이션
public class GroupListService { // 로직을 정의 하는 부분
	
	/* 여러건의 데이터 가지고 오기(Select) */
	
	/*
	public List<GroupListDto> selectList() {
		List<GroupListDto> groupListDtos = new ArrayList<>();
		groupListDtos = groupListDao.selectList();
		
		return groupListDtos;
	}
	*/
	// 위와 같이 List<GroupListDto>를 직접 생성해서 해도 되지만,
	// groupListDao에서 바로 selectList()를 받아와도 된다.
	
	@Autowired	// 이미 생성된 클래스를 사용하기 위해서 쓰는 어노테이션
	// 스프링부트에서는 @Controller, @Service, @Repository로 정의된 클래스는
	// 구동될때 이미 생성이 된다.
	GroupListDao groupListDao; 	// 위와 같은 이유로 new 키워드로 객체를 생성하지 않아도 이미 생성이 되어 있다. 
								// => 스프링의 특징 중 2, 3
								// loC(이미 다양한 곳에서 사용되는 클래스 생성됨),
								// DI(이미 생성된 클래스라 다양한 곳에서 쉽게 사용)
			
								// Service는 Dao만 호출
	public List<GroupListDto> selectList() {
		return groupListDao.selectList();
	}
	
	// 조건에 맞는 데이터 1줄만 읽어오기
	public GroupListDto selectOne(GroupListDto groupListDto) {
		return groupListDao.selectOne(groupListDto);
	}
	
	// 데이터 1개 추가 (몇 번의 update/insert/delete 했는지를 return)
	public int insert(GroupListDto groupListDto) {
		return groupListDao.insert(groupListDto);
	}
	
	// 데이터 1개 수정 (몇 번의 update/insert/delete 했는지를 return)
	public int update(GroupListDto groupListDto) {
		return groupListDao.update(groupListDto);
	}
	
	// 데이터 1개 삭제 (몇 번의 update/insert/delete 했는지를 return)
	public int delete(GroupListDto groupListDto) {
		return groupListDao.delete(groupListDto);
	}
	

	// 데이터 1개 삭제 값 세팅 - update 이용 (몇 번의 update/insert/delete 했는지를 return)
	public int uelete(GroupListDto groupListDto) {
		return groupListDao.uelete(groupListDto);
	}
		
}
