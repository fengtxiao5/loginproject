package com.firstcombo.login.loginserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName LoginServerApplicationStarter
 * @Description
 * @Author ftx
 * @Date 2021/8/24 17:12
 * @Version 1.0
 **/
@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
@MapperScan("com.firstcombo.login.loginserver.infrastructure.repo.mapper")
public class LoginServerApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(LoginServerApplicationStarter.class);
    }
}
