package com.coilabs.servrce.data;

import com.coilabs.model.data.UserP;

import java.util.List;

public interface DataService {
    public List<UserP> getUsers();
    public int addUser();
    public int addUserT();
}
