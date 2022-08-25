package cn.gaple.skeleton.api.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "skeleton-service")
@Component
public interface MyUserApi {
    @PostMapping("/my/p")
    String abc(@RequestParam("abc") String abc);
}
