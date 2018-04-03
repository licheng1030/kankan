package com.coilabs.controller;


import com.coilabs.modle.User;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/get")
    @Cacheable(value="user-key",key = "#key+#name")
    public List<User> getRedis(String key, String name) {
        List<User> list=new ArrayList<User>();
        User modle=new User();
        modle.setId("get");
        modle.setName("get");
        list.add(modle);
        list.add(modle);
        System.out.print("meizhouredis");
        return  list;
    }
    @RequestMapping("/set")
    @CachePut(value="user-key",key = "#key+#name")
    public List<User> setRedis(String key ,String name) {
        List<User> list=new ArrayList<User>();
        User modle=new User();
        modle.setId("set");
      //  modle.setName("get");
        list.add(modle);
        list.add(modle);
        System.out.print("meizhouredis");
        return  list;
    }
}
