package com.yefeng;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class XiaofangwaimaiApplication {

    public static void main(String[] args) {
        log.info("-------启动项目------");
        SpringApplication.run(XiaofangwaimaiApplication.class, args);
    }

}
