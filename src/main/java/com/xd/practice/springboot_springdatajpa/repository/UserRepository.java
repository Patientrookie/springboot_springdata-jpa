package com.xd.practice.springboot_springdatajpa.repository;

import com.xd.practice.springboot_springdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author xiaqi
 */
public interface UserRepository extends JpaRepository<User, Long> {

//    User findByUserName(String username);


    //nativeQuery=true，属性的设置，是表明该方法中的sql以数据库的sql语句格式对待
    /**
     * @Description:  分页查询第一种方式  (Pageable springdata-jpa自带分页)
     * @Author: xiaqi
     * @Date: 09/06/2020 11:40
     * @Param: []
     * @Return java.util.List<com.xd.practice.springboot_springdatajpa.entity.User>
     **/
//    @Query(value = "select * from user",nativeQuery = true)
//    @Transactional(timeout = 10)
//    List<User> selectAllUser(Pageable pageable);



    /**
     * @Description: 分页查询第二种方式  (SQL查询)
     *               LIMIT 子句可以被用于强制 SELECT 语句返回指定的记录数。LIMIT 接受一个或两个数字参数。参数必须是一个整数常量。如果给定两个参数，第一个参数指定第一个返回记录行的偏移量，第二个参数指定返回记录行的最大数目。初始记录行的偏移量是 0(而不是 1)
     * @Author: xiaqi
     * @Date: 09/06/2020 13:55
     * @Param: [page, total]
     * @Return java.util.List<com.xd.practice.springboot_springdatajpa.entity.User>
     **/
//    @Query(value = "select * from user limit :page, :total",nativeQuery = true)
//    @Transactional(timeout = 10)
//    List<User> selectAllUser(@Param(value = "page") int page, @Param(value = "rows") int rows);

}
