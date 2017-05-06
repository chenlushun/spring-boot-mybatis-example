package spring.boot.mybatis.example.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.mybatis.example.service.UserService;

import java.util.List;

/**
 * Created by Alex on 2017/5/4.
 *
 * @author Alex
 */
@RestController
@RequestMapping
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping
    public List<User> index() {
        return userService.findAll();
    }


}
