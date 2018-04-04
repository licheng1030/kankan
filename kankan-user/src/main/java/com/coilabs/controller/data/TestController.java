package com.coilabs.controller.data;

import com.coilabs.model.data.UserP;
import com.coilabs.servrce.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

@Autowired
  private DataService dataService;

@RequestMapping("get")
public List<UserP> getUserList(){
    return dataService.getUsers();
}

    @RequestMapping("add")
    public int  setUser(){
        return dataService.addUser();
    }

    @RequestMapping("add1")
    public int setUser1(){
        return dataService.addUserT();
    }

}
