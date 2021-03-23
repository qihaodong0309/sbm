package com.qhd.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author qihaodong
 */
@Data
public class User {

    private Long id;
    private String name;
    private String sex;
    private Integer age;
    private Date createTime;
    private Date updateTime;
    private Integer status;

    public User() {

    }

    public User(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

}
