package com.tm.filedcl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;


@MapperScan("com.tm.filedcl.domain.mapper")
//@ServletComponentScan
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FiledclApplication {

    public static void main(String[] args) {
        SpringApplication.run(FiledclApplication.class, args);
    }

}
