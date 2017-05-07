package spring.boot.mybatis.example.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.boot.mybatis.example.mapper.UserMapper;
import spring.boot.mybatis.example.model.User;

import java.util.List;

/**
 * Created by Alex on 2017/5/6.
 *
 * @author Alex
 */
@Repository
public class UserRespositoryImpl implements UserRespository {
    @Autowired
    public UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
