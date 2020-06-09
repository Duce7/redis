package cn.victorplus.vehicle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"cn.victorplus.vehicle"})
@EnableTransactionManagement
@MapperScan("cn.victorplus.vehicle.mapper")
@EnableFeignClients(basePackages = "cn.victorplus.vehicle.client")
@EnableDiscoveryClient
public class RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

}
