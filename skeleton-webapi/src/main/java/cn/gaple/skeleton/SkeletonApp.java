package cn.gaple.skeleton;

import cn.maple.core.framework.annotation.GXEnableLeafFramework;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 塵渊
 * @since 2020-02-18 10:27
 */
@SpringBootApplication
@GXEnableLeafFramework
@EnableCaching
@EnableScheduling
@EnableDiscoveryClient
@EnableFeignClients
public class SkeletonApp {
    public static void main(String[] args) {
        System.setProperty("nacos.logging.default.config.enabled", "false");
        SpringApplication.run(SkeletonApp.class, args);
        System.out.println("Maple Framework Skeleton APP模块启动成功");
    }
}
