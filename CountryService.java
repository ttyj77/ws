package com.kong.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kong.dao.CountryDao;
import com.kong.model.CountryVo;

@Service("countryService")
@Transactional
public class CountryService {
	private CountryDao countryDao;
	
	Logger logger = LoggerFactory.getLogger("com.kong.service.CountryService");

	
	public CountryService(CountryDao countryDao) {
		this.countryDao = countryDao;
	}


	public List<CountryVo> listCountry() {
		List<CountryVo> countryList = countryDao.selectAllCountrys();
		return countryList;
	}
	
	
}
