package com.xd.practice.springboot_springdatajpa;

import com.xd.practice.springboot_springdatajpa.entity.User;
import com.xd.practice.springboot_springdatajpa.enums.Gender;
import com.xd.practice.springboot_springdatajpa.repository.UserRepository;
import com.xd.practice.springboot_springdatajpa.utils.SnowFlakeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @ClassName UserRepositoryTest
 * @Description TODO
 * @Author xiaqi
 * @Date 09/06/2020 11:14
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
//@Ignore
public class UserRepositoryTest {

    //默认安照名称进行装配，名称可以通过name属性进行指定 ，如果没有指定name属性，当注解写在字段上时，默认取字段名进行按照名称查找，如果注解写在setter方法上默认取属性名进行装配。 当找不到与名称匹配的bean时才按照类型进行装配。但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。
    @Resource
    private UserRepository userRepository;

    @Test
    public void insertUserTest(){

//        long id = new SnowFlakeUtils(0,0).nextId();
//        Timestamp timestamp = new Timestamp(new Date().getTime());

//        User user = new User();
//        user.setId(id);
//        user.setUsername("cc");
//        user.setPassword("123456");
//        user.setGender(Gender.FEMALE);
//        user.setAge(23);
//        user.setNickname("昵称3");
//        user.setCreateTime(new Timestamp(new Date().getTime()));
//        user.setCreateBy("shawn");
//        user.setUpdateTime(new Timestamp(new Date().getTime()));
//        user.setUpdateBy("shawn");
//        userRepository.save(user);
//        userRepository.save(new User(id,"aa","123456","MALE",20,"昵称",new Timestamp(new Date().getTime()),"shawn",
//                new Timestamp(new Date().getTime()),"shawn"));
//        userRepository.save(new User("dd","dd123456","dd@126.com","dd",formattedDate));
//        userRepository.save(new User("ee","ee123456","ee@126.com","ee",formattedDate));
//        userRepository.save(new User("bb","bb123456","bb@126.com","bb",formattedDate));
//        userRepository.save(new User("cc","cc123456","cc@126.com","cc",formattedDate));
//
//        Assert.assertEquals((int)3,userRepository.findAll().size());
//        Assert.assertEquals("bb",userRepository.findByUserNameOrEmail("bb","bb@126.com").getNickName());
//        userRepository.delete(userRepository.findByUserName("aa"));

//        Pageable pageable = PageRequest.of(0,5);        //分页查询 第一种方式
//        System.out.println(userRepository.selectAllUser(pageable).size());
        Long id = 722153192581758978L;
        System.out.println(userRepository.findById(id).get().getGender());

//        System.out.println(userRepository.selectAllUser(0,5).size()); //分页查询 第二种方式
    }
}
