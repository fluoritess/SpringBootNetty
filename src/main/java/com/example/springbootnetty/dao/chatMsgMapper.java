package com.example.springbootnetty.dao;

import com.example.springbootnetty.po.chatMsg;
import com.example.springbootnetty.po.chatMsgExample;
import java.util.List;

public interface chatMsgMapper {
    int countByExample(chatMsgExample example);

    int deleteByExample(chatMsgExample example);

    int deleteByPrimaryKey(String id);

    int insert(chatMsg record);

    int insertSelective(chatMsg record);

    List<chatMsg> selectByExample(chatMsgExample example);

    chatMsg selectByPrimaryKey(String id);



    int updateByPrimaryKeySelective(chatMsg record);

    int updateByPrimaryKey(chatMsg record);
}