
package com.kong.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kong.model.CountryVo;
import com.kong.service.CountryService;

@Controller("countryController")

@RequestMapping("/country")
public class CountryController {
	@Autowired
	CountryService countryService;
	
	@Autowired
	CountryVo countryVo;
	
	List<CountryVo> countryList = new ArrayList<CountryVo>();
	
	Logger logger = LoggerFactory.getLogger("com.kong.service.CountryController");
	
	@RequestMapping({"/listCountry", "/"}) //주소를 여러개 맵핑 시킬 때 배열을 사용 "/" 이건 모든 경로 
	public String getCountryList(Model model) {
		logger.info("=============> getCountryList 메서드 진입");
		countryList = countryService.listCountry();
		model.addAttribute("countryList", countryList); 
		return "listCountry";
	}
	
	
	
	
}
