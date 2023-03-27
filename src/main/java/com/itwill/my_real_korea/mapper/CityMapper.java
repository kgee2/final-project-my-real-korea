package com.itwill.my_real_korea.mapper;

import java.util.List;

import com.itwill.my_real_korea.dto.City;

public interface CityMapper {
	//1. 시티 새로 추가
	int insertCity(City city) throws Exception;
	//2. 시티번호로 시티 찾기
	int selectByCityNo(int cityNo) throws Exception;
	//3. 시티 리스트 전체 출력
	List<City> selectAllCity() throws Exception;
}
