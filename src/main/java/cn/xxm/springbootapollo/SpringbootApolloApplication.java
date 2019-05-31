package cn.xxm.springbootapollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableApolloConfig
public class SpringbootApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApolloApplication.class, args);
    }

}
