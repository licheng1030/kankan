package com.coilabs.servrce.data.impl;

import com.coilabs.mapper.data.UserPMapper;
import com.coilabs.model.data.UserP;
import com.coilabs.servrce.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private UserPMapper userPMapper;

    @Override
    public List<UserP> getUsers() {
        return userPMapper.selectByExample(null);
    }

    @Override
    public int addUser() {
        UserP  user=new  UserP();
        UserP  user1=new  UserP();
        user.setUserName("test2");
        user.setPassword("AAAAAA");
        user1.setUserName("test3");
        user1.setPassword("BBBBB");
        userPMapper.insertSelective(user);
        int q=  1/0;

        userPMapper.insertSelective(user1);

        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public int addUserT() {

        UserP  user=new  UserP();
        UserP  user1=new  UserP();
        user.setUserName("test5");
        user.setPassword("cccc");

        user1.setUserName("test6");
        user1.setPassword("dddd");
        userPMapper.insertSelective(user);
        int q=  1/0;
        userPMapper.insertSelective(user1);
        return 0;
    }


}
