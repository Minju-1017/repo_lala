package com.lala.fapp.grouplist;

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
	
	/*
	public String groupListXdmList(Model model) { 	
		List<GroupListDto> groupListDtos = new ArrayList<>();
		groupListDtos = groupListService.selectList();
		
		model.addAttribute("groupList", groupListDtos);
		
		return "groupList/groupListXdmList";
	}
	*/
	// 위와 같이 List<GroupListDto>를 직접 생성해서 해도 되지만,
	// groupListService에서 바로 selectList()를 받아와도 된다.
	
	/**
	 * 전체 데이터 읽어오기
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/grouplist/groupListXdmList")
	public String groupListXdmList(Model model) { 	// Model: 스프링부트에서 제공하는 클래스
													// java에 있는 객체를 html로 전달하는 역할을 함
		model.addAttribute("groupList", groupListService.selectList());
		// 데이터 전송 경로: groupListDtos에 있는 데이터 -> "groupList" -> "groupList/groupListXdmList"
		
		return "grouplist/groupListXdmList";
	}

	/**
	 * 조건에 맞는 데이터 1줄만 읽어오기
	 * @param model
	 * @param groupListDto html에서 호출되는 파라메터와 일치하는 값이 있다면, 자동으로 바인딩 된다.
	 * @return
	 */
	@RequestMapping(value = "/grouplist/groupListXdmItem")
	public String groupListXdmItem(Model model, GroupListDto groupListDto) {
		model.addAttribute("groupListItem", groupListService.selectOne(groupListDto));
		
		return "grouplist/groupListXdmItem";
	}
	
}
