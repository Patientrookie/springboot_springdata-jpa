package com.xd.practice.springboot_springdatajpa.entity;

import com.xd.practice.springboot_springdatajpa.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName User
 * @Description TODO
 * @Author xiaqi
 * @Date 15/06/2020 16:58
 * @Version 1.0
 **/
@Entity
@NoArgsConstructor
public class User implements Serializable {

    private long id;
    private String username;
    private String password;
    private Gender gender;
    private Integer age;
    private String nickname;
    private Timestamp createTime;
    private String createBy;
    private Timestamp updateTime;
    private String updateBy;


    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "gender")
    @Convert(converter = Gender.Convert.class)
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_by")
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "update_by")
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(gender, user.gender) &&
                Objects.equals(age, user.age) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(createTime, user.createTime) &&
                Objects.equals(createBy, user.createBy) &&
                Objects.equals(updateTime, user.updateTime) &&
                Objects.equals(updateBy, user.updateBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, gender, age, nickname, createTime, createBy, updateTime, updateBy);
    }

    public User(long id, String username, String password, Gender gender, Integer age,
                String nickname, Timestamp createTime, String createBy, Timestamp updateTime, String updateBy) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.nickname = nickname;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
    }
}
