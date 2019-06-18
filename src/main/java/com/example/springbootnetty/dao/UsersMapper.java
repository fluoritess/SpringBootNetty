package com.example.springbootnetty.dao;

import com.example.springbootnetty.po.Users;
import com.example.springbootnetty.po.UsersExample;
import org.jboss.logging.Param;

import java.util.List;


public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}