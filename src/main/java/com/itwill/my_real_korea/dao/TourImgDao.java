package com.itwill.my_real_korea.dao;

import java.util.List;

import com.itwill.my_real_korea.dto.TourImg;

public interface TourImgDao {
	//1. 투어이미지 하나 추가
	int insertTourImg(TourImg tourImg);
	//2. 투어이미지번호로 투어이미지 하나 삭제
	int deleteTourImg(int toImgNo);
	//3. 투어번호 해당 투어이미지 전체출력
	List<TourImg> selectTourImgList(int to_no);
	//4. 투어번호로 해당 투어이미지 전체 삭제
	int deleteTourAllImg(int toNo);
}
