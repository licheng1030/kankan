package com.coilabs.servrce.data.impl;

import com.coilabs.mapper.data.UserPMapper;
import com.coilabs.model.data.UserP;
import com.coilabs.servrce.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService{
    @Autowired
    private UserPMapper userPMapper;

public List<UserP> getUsers(){
    return userPMapper.selectByExample(null);
}

}
