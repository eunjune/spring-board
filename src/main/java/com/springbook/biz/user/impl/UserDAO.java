package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;

@Repository("userDAO")
public class UserDAO {
	private final String USER_GET = "select * from users where id=? and password=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public UserVO getUser(UserVO vo) {
		Object[] args = {vo.getId(),vo.getPassword()};
		return jdbcTemplate.queryForObject(USER_GET,args,new UserRowMapper());
	}

}
