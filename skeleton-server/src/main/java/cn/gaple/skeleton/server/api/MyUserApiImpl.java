package cn.gaple.skeleton.server.api;

import cn.gaple.skeleton.api.user.MyUserApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyUserApiImpl implements MyUserApi {
    @Override
    public String abc(String abc) {
        return "看一哈 : " + abc;
    }
}
