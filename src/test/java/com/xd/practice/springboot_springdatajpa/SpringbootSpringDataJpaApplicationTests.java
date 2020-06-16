package com.xd.practice.springboot_springdatajpa;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith就是一个运行器 SpringRunner 继承了 SpringJUnit4ClassRunner 没有扩展任何功能；使用前者，名字简短而已
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootSpringDataJpaApplicationTests {

    @Test
    void contextLoads() {
    }

}
