package net.xdclass.base_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author hdz
 * @ClassName XdClassApplication
 * @Description XdClass Application的启动类
 * @Date 2020/05/19 13:40
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("net.xdclass.base_project.mapper")
@EnableScheduling
public class XdClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(XdClassApplication.class, args);
    }

}
