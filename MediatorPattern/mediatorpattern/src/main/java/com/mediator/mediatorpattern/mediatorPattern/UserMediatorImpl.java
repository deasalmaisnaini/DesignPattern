package com.mediator.mediatorpattern.mediatorPattern;

import org.springframework.stereotype.Component;

import com.mediator.mediatorpattern.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMediatorImpl implements UserMediator {
    private List<User> userList = new ArrayList<>();

    @Override
    public void addUser(User user) {
        userList.add(user);
        System.out.println("User added: " + user.getUsername());
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }
}
