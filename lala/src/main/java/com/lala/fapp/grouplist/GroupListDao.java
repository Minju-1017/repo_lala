package com.lala.fapp.grouplist;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository // Dao의 필수 어노테이션
public interface GroupListDao {
	
	/* mapper(xml)에서 해당하는 쿼리와 연결 시켜주고, 쿼리 결과를 가져옴 */
	// Dao는 Mapper(xml)만 호출
	
	public List<GroupListDto> selectList();
}
