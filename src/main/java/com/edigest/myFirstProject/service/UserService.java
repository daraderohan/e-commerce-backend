package com.edigest.myFirstProject.service;

import  com.edigest.myFirstProject.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
        List<User> userlist= new ArrayList<>();
          public List<User> getUsers()
          {

              return userlist;
          }
    public User getUser(int id)
    {
        User foundUser = null;
        for (User user : userlist) {
            if (user.getId() == id) {
                foundUser = user;
                break; // Stop searching once found
            }
        }
        return foundUser;
    }
          public User  addUser(User user)
          {
               // this.user = user;
              userlist.add(user);
                return user;
          }


}


