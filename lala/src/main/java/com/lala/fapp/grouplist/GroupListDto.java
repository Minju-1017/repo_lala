package com.lala.fapp.grouplist;

// Dto 클래스는 POJO 방식: Java에서 사용하는 getter, setter만 있는 방식을 채용(스프링의 특징1)
public class GroupListDto {
	
	// 정수형(int) -> Integer
	// 문자열(varchar) -> String
	
	private String seq; // seq는 예외로 int형으로 DB에 저장되어 있지만, 편의를 위해 String으로 선언한다.
	private String groupName;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}
