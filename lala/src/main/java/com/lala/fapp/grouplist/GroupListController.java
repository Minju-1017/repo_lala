package com.lala.fapp.grouplist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Controller의 필수 어노테이션
public class GroupListController {
	
	/* 입력되는 주소에 매칭이 되는 html 정보를 정의 */
	/* html로 데이터 전달 */
	
	@Autowired
	GroupListService groupListService; // Controller는 Service만 호출
	
	@RequestMapping(value = "/groupList/groupListXdmList")
	public String groupListXdmList(Model model) {
		List<GroupListDto> groupListDtos = new ArrayList<>();
		groupListDtos = groupListService.selectList();
		
		model.addAttribute("list", groupListDtos);
		
		return "groupList/groupListXdmList";
	}
	
}
