package com.qhd;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qihaodong3
 */
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class DbReadWriteApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbReadWriteApplication.class, args);
    }

}
