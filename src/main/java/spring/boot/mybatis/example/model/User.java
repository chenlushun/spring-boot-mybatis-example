package spring.boot.mybatis.example.model;

import lombok.*;

import java.io.Serializable;

/**
 * Created by Alex on 2017/5/4.
 *
 * @author Alex
 */
@Data
public class User implements Serializable {

    private Long id;

    private String userName;

    private Integer age;

}
