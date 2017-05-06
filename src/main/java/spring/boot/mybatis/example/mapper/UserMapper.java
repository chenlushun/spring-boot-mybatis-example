package spring.boot.mybatis.example.mapper;

import org.apache.catalina.User;

import java.util.List;

/**
 * Created by Alex on 2017/5/4.
 *
 * @author Alex
 */
public interface UserMapper {

    public List<User> findAll();
}
