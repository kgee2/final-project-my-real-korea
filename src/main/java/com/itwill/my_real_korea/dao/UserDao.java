package com.itwill.my_real_korea.dao;

import java.util.List;

import com.itwill.my_real_korea.dto.User;

public interface UserDao {

	int create(User user) throws Exception;

	int update(User user) throws Exception;

	int remove(String userId) throws Exception;

	User findUser(String userId) throws Exception;

	List<User> findUserList() throws Exception;
	
	//회원 존재 여부 확인
	boolean isExistUser(String userId) throws Exception;
	
//	boolean isMatchPassword(String passwrod) throws Exception;
	
	

}