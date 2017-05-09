package spring.boot.mybatis.example.respository;

import spring.boot.mybatis.example.model.User;

import java.util.List;

/**
 * Created by Alex on 2017/5/4.
 *
 * @author Alex
 */
public interface UserRespository {
    public List<User> findAll();

    public void insert(User user);
}
