package com.kong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.kong.model.CountryVo;

@Mapper
@Repository("countryDao")
public interface CountryDao {
	
	public List<CountryVo> selectAllCountrys() throws DataAccessException;
	public CountryVo selectCountry(int countryNo) throws DataAccessException;
	public void insertCountry(CountryVo country)throws DataAccessException;
	public void updateCountry(CountryVo country)throws DataAccessException;
	public void deleteCountry(int countryNo)throws DataAccessException;
 
}
