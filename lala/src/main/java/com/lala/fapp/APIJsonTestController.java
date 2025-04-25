package com.lala.fapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class APIJsonTestController {

	@RequestMapping(value = "/publicCorona1JsonNodeList")
	public String publicCorona1JsonNodeList(Model model) throws Exception {
		
		String apiUrl = 
				"http://apis.data.go.kr/1471000/CovidDagnsRgntProdExprtStusService/getCovidDagnsRgntProdExprtStusInq" 
				+ "?serviceKey=%2B%2F0bk8wLCo7GZ3DjLjq2qU%2FeEH0MteYK0rKnWyRLtEvaxpoJL4dwT45cC77E%2FCyjWcrRyXK6Rl3nhfigsXXGvg%3D%3D&type=json";
		
		URL url = new URL(apiUrl);
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		httpURLConnection.setRequestMethod("GET");
		
		BufferedReader bufferedReader;
		if (httpURLConnection.getResponseCode() >= 200 && httpURLConnection.getResponseCode() <= 300) {
			bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
		} else {
			bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println("line: " + line);
			stringBuilder.append(line);
		}

		bufferedReader.close();
		httpURLConnection.disconnect();

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode node = objectMapper.readTree(stringBuilder.toString());
		
		System.out.println(
				"node.get(\"header\").get(\"resultCode\").asText(): "
				+ node.get("header").get("resultCode").asText()
		);
		System.out.println(
				"node.get(\"header\").get(\"resultMsg\").asText(): "
				+ node.get("header").get("resultMsg").asText()
		);
		System.out.println(
				"node.get(\"header\").get(\"resultMsg\").asText(): "
				+ node.get("body").get("items").get(0).get("KIT_PROD_QTY").asText()
		);
		System.out.println(
				"node.get(\"header\").get(\"resultMsg\").asText(): "
				+ node.get("body").get("pageNo").asText()
		);
		System.out.println(
				"node.get(\"header\").get(\"resultMsg\").asText(): "
				+ node.get("body").get("items").get(0).get("YYYY").asText()
		);
		
		model.addAttribute("node", node);
		
		return "publicCorona1JsonNodeList";
	}
	
}
