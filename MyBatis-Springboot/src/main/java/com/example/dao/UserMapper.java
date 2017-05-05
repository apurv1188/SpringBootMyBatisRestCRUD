package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.example.model.User;
import java.util.List;

@Mapper
public interface UserMapper {

	@Select("SELECT * FROM USERS") // SQL
	List<User> findAll();

	@Select("SELECT * FROM USERS WHERE USER_NAME = #{userName}")
	List<User> findByuserName(@Param("userName") String userName);

}