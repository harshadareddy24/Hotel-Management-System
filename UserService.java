package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class UserService {

    @Autowired
 private UserRepository userRepo1;
    public List<User> listAll() {
        return userRepo1.findAll();
    }
}
