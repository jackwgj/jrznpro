package com.jrzn.hb.jrznpro.mapper;


import com.jrzn.hb.jrznpro.model.AppMessage;

import java.util.List;

public interface AppMessageMapper {

    int deleteByPrimaryKey(String id);

    int insert(AppMessage record);

    int insertSelective(AppMessage record);

    AppMessage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AppMessage record);

    int updateByPrimaryKey(AppMessage record);

    List<AppMessage> selectAll();

    List<AppMessage> getMessById(String id);
}
