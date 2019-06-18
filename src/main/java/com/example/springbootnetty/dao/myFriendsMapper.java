package com.example.springbootnetty.dao;

import com.example.springbootnetty.po.myFriends;
import com.example.springbootnetty.po.myFriendsExample;
import java.util.List;


public interface myFriendsMapper {
    int countByExample(myFriendsExample example);

    int deleteByExample(myFriendsExample example);

    int deleteByPrimaryKey(String id);

    int insert(myFriends record);

    int insertSelective(myFriends record);

    List<myFriends> selectByExample(myFriendsExample example);

    myFriends selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(myFriends record);

    int updateByPrimaryKey(myFriends record);
}