package com.hendisantika.springbootexportcsv.service;

import com.hendisantika.springbootexportcsv.domain.User;
import com.hendisantika.springbootexportcsv.domain.User2;
import com.hendisantika.springbootexportcsv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-csv
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-08
 * Time: 07:03
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> listUsers() {
        List<User> users = new ArrayList<>();

        //create dummy users
        users.add(new User(1, "Uzumaki Naruto", "naruto@example.com", "Japan", 35));
        users.add(new User(2, "Uchiha Sasuke", "sasuke@konohagakure", "Japan", 21));
        users.add(new User(3, "Haruno Sakure", "sakura@konohagakure.com", "Japan", 29));

        return users;
    }

    public List<User2> listAll() {
        return userRepository.findAll(Sort.by("email").ascending());
    }
}
