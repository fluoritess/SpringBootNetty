package com.example.springbootnetty.dao;

import com.example.springbootnetty.po.friendsRequest;
import com.example.springbootnetty.po.friendsRequestExample;
import java.util.List;

public interface friendsRequestMapper {
    int countByExample(friendsRequestExample example);

    int deleteByExample(friendsRequestExample example);

    int deleteByPrimaryKey(String id);

    int insert(friendsRequest record);

    int insertSelective(friendsRequest record);

    List<friendsRequest> selectByExample(friendsRequestExample example);

    friendsRequest selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(friendsRequest record);

    int updateByPrimaryKey(friendsRequest record);
}