package spring.boot.mybatis.example.respository;

import org.apache.catalina.User;

import java.util.List;

/**
 * Created by Alex on 2017/5/4.
 *
 * @author Alex
 */
public interface UserRespository {
    public List<User> findAll();
}
