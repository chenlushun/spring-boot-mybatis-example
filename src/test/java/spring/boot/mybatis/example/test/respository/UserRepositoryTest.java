package spring.boot.mybatis.example.test.respository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.mybatis.example.model.User;
import spring.boot.mybatis.example.respository.UserRespository;

import java.util.List;

/**
 * Created by Alex on 2017/5/7.
 *
 * @author Alex
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "test")
@Transactional
public class UserRepositoryTest{

    @Autowired
    private UserRespository userRepository;

    @Test
    public void demo() {
        List<User> list = userRepository.findAll();
        Assert.assertNotNull(list);
    }

    @Test
    public void insert(){
        User user=new User();
        user.setAge(19);
        user.setId(2L);
        user.setUserName("Alex");
        userRepository.insert(user);
        List<User> list = userRepository.findAll();
        Assert.assertNotNull(list);
    }

}
