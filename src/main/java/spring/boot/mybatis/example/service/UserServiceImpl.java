package spring.boot.mybatis.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.mybatis.example.model.User;
import spring.boot.mybatis.example.respository.UserRespository;

import java.util.List;

/**
 * Created by Alex on 2017/5/6.
 *
 * @author Alex
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRespository userRespository;

    @Override
    public List<User> findAll() {
        return userRespository.findAll();
    }
}
