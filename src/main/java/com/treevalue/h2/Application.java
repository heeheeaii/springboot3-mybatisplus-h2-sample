package com.treevalue.h2;

import com.treevalue.h2.service.impl.TreeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

/**
 * @author hee
 */
@Slf4j
@SpringBootApplication
@MapperScan({"com.treevalue.h2.mapper"})
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        TreeServiceImpl treeServiceimpl = Optional.ofNullable(context.getBean(TreeServiceImpl.class)).orElse(null);
        log.info("program run successfully");
    }
}
