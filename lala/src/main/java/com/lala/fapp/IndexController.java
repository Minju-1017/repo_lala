package com.lala.fapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 초기 접속 페이지 Mapping Url에 대한 정의 파일
 * 
 * 참고로 index.html 파일이 없으므로
 * resources 폴더 안에 templates 폴더를 만든 후 
 * index.html 파일을 생성해줘야 웹으로 접속이 가능하다. 
 * (접속 url - localhost:8080/index)
 * 
 * 아래 폴더들은 스프링에서 정해놓은 기본 폴더이다. (규칙처럼)
 * resources/templates - html
 * resources/static - css, js..
 */

@Controller // Controller 파일은 전부 해당 어노테이션(@Controller)을 달아줘야 한다.
			// 안 달아주면 정의된 주소를 찾으려고 해도 안된다.
public class IndexController {
	
	@RequestMapping(value = "/index") // localhost:8080/index를 의미한다.
	public String index() { // 관례적으로 메소드명은 어노테이션에 정의된 것과 동일하게 한다.
		return "index"; 	// templates/index.html
		
	}
	
	// 만약 templates 안에 폴더 경로가 추가 되면 폴더명/index로 넣어준다. ↓
	@RequestMapping(value = "/index2") // localhost:8080/index2를 의미한다.
	public String index2() {
		return "abc/inddex"; // templates/abc/inddex.html
	}
	
	@RequestMapping(value = "/index3")
	public String index3() {
		return "abc/indddex"; // templates/abc/indddex.html
	}
}
