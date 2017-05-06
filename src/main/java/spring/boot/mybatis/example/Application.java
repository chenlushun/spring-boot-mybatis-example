package spring.boot.mybatis.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Alex on 2017/5/4.
 *
 * @author Alex
 */
@SpringBootApplication
@MapperScan("spring.boot.mybatis.example.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
