package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author dengweiping
 * 2020-01-15 15:54
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.blog") //扫描@Controller、@Service 注解；
@EnableJpaRepositories(basePackages = "com.blog.repository") //扫描@Repository 注解；
@EntityScan(basePackages = "com.blog.domain") //扫描@Entity 注解；

public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
