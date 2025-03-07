package com.lala.fapp.grouplist;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository // Dao의 필수 어노테이션
public interface GroupListDao {
	
	/* 
		mapper(xml)에서 해당하는 쿼리와 연결 시켜주고, 쿼리 결과를 가져옴
		Dao는 Mapper(xml)만 호출
		Dao는 Mapper는 한몸
		
		mybatis라는 프레임워크가 추가되면서,
		데이터가 여러개일 때는 List<Dto>에 한개일 때는 1개의 Dto를 자동으로 리턴한다.
	*/
	
	
	// 메소드명은 Mapper.xml의 <select> 태그의 id와 동일하게 한다
	public List<GroupListDto> selectList(); 
	
	// 조건에 맞는 데이터 1줄만 읽어오기
	public GroupListDto selectOne(GroupListDto groupListDto);
	
	// 데이터 1개 추가 (몇 번의 update/insert/delete 했는지를 return)
	public int insert(GroupListDto groupListDto);
	
	// 데이터 1개 수정 (몇 번의 update/insert/delete 했는지를 return)
	public int update(GroupListDto groupListDto);
	
	// 데이터 1개 삭제 (몇 번의 update/insert/delete 했는지를 return)
	public int delete(GroupListDto groupListDto);
	
	// 데이터 1개 삭제 값 세팅 - update 이용 (몇 번의 update/insert/delete 했는지를 return)
	public int uelete(GroupListDto groupListDto);
	
}
