package com.jrzn.hb.jrznpro.service;

import com.jrzn.hb.jrznpro.mapper.AppMessageMapper;
import com.jrzn.hb.jrznpro.model.AppMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppMessageServiceImpl implements IAppMessageService {

    @Autowired
    private AppMessageMapper appMessageMapper;

    @Override
    public List<AppMessage> getMessage() {
        List<AppMessage> list = new ArrayList<AppMessage>();
        list.add(appMessageMapper.selectByPrimaryKey("xtt"));
        return list;
    }

    @Override
    public List<AppMessage> getAllMessage() {
        List<AppMessage> list = new ArrayList<AppMessage>();
        list = appMessageMapper.selectAll();
        return list;
    }

    @Override
    public int addMessage(AppMessage appMessage) {
        return appMessageMapper.insert(appMessage);
    }

    @Override
    public List<AppMessage> getMessageById(String id) {
        return appMessageMapper.getMessById(id);
    }

    @Override
    public int delMessage(String id) {
        return appMessageMapper.deleteByPrimaryKey(id);
    }
}
