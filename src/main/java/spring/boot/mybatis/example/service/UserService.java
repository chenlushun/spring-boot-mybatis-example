package spring.boot.mybatis.example.service;

import org.apache.catalina.User;

import java.util.List;

/**
 * Created by Alex on 2017/5/4.
 *
 * @author Alex
 */
public interface UserService {


    public List<User> findAll();
}
