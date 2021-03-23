package com.qhd.mapper;

import com.qhd.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author qihaodong3
 */
@Mapper
public interface UserMapper {

    /**
     * 插入一条记录
     *
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> selectAll();

}
