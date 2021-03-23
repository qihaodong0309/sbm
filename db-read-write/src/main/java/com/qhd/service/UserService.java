package com.qhd.service;

import com.qhd.entity.User;

import java.util.List;

/**
 * 用户接口类
 *
 * @author qihaodong3
 */
public interface UserService {

    /**
     * 查询用户列表
     *
     * @return
     */
    List<User> list();

    /**
     * 保存一个用户
     *
     * @param user
     * @return
     */
    int saveOne(User user);

}
