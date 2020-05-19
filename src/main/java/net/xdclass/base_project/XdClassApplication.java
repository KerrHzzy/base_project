package net.xdclass.base_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hdz
 */
@SpringBootApplication
@MapperScan("net.xdclass.base_project.mapper")
public class XdClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(XdClassApplication.class, args);
    }

}
