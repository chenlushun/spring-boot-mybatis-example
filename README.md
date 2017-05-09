# spring-boot-mybatis-example
spring boot integration mybatis

## junit test

```java

@RunWith(SpringRunner.class)
@SpringBootTest
//在测试类上面指定profiles，可以改变当前spring 的profile，来达到多环境的测试
@ActiveProfiles(profiles = "test")
@Transactional

```
   * If your test is @Transactional, it will rollback the transaction at the end of each test method by default. 
## todoList 

    * dubbo 接口的测试
