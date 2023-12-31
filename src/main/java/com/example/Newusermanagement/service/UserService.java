package com.example.Newusermanagement.service;

import com.example.Newusermanagement.repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public  String updateEmail(Integer id, String emailId) {
        List<User> originalList = getAllUsers();
        for(User u : originalList)
        {
            if(id.equals(u.getUsername()))
            {
                //originalList.remove(u);
                u.setUsername(emailId);
                //originalList.add(u);

                return "updated";
            }
        }

        return "id not found";
    }

    public List<User> getAllUsers() {
        return userRepo.getUsers();
    }

    public String createUsers(List<User> users) {
        List<User> originalList = getAllUsers();
        originalList.addAll(users);
        return "New users added";

    }

    public String createUser(User user) {
        List<User> originalList = getAllUsers();
        originalList.add(user);
        return "New user added";
    }

    public String removeUser(Integer id) {
        List<User> originalList = getAllUsers();
        for(User u : originalList)
        {
            if(id.equals(u.getUsername()))
            {
                originalList.remove(u);
                return "removed";
            }
        }
        return "Id not found";
    }
}
