package com.mediator.mediatorpattern.mediatorPattern;
import java.util.List;

import com.mediator.mediatorpattern.model.User;

public interface UserMediator {
    void addUser(User user);
    List<User> getAllUsers();
}
