package com.qhd.controller;

import com.qhd.entity.User;
import com.qhd.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qihaodong
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 保存用户接口
     *
     * @return
     */
    @PostMapping("save-user")
    public String saveUser() {
        int result = userService.saveOne(new User("王麻子", "男", 33));
        if (result > 0) {
            return "添加成功";
        }
        return "添加失败";
    }

    /**
     * 返回用户列表
     *
     * @return
     */
    @PostMapping("list-user")
    public List<User> getList() {
        return userService.list();
    }

}
