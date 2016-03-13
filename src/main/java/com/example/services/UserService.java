/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.dao.UserDao;
import com.example.dao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class UserService {
    
    private UserDao dao;

    @Autowired
    public UserService(UserDao dao) {
        this.dao = dao;
    }
    
    public User insert(int id, String name){
        User u = new User();
        u.setFio(name);
        u.setId(id);
        return dao.save(u);
    }
    
    public User get(int id){
        return dao.findOne(id);
    }
    
}
