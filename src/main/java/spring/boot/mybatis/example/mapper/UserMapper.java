package spring.boot.mybatis.example.mapper;

import spring.boot.mybatis.example.model.User;

import java.util.List;

/**
 * Created by Alex on 2017/5/4.
 *
 * @author Alex
 */
public interface UserMapper {

    public List<User> findAll();

    public void insert(User user);
}
