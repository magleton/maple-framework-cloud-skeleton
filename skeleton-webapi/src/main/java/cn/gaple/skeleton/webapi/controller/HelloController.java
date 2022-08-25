package cn.gaple.skeleton.webapi.controller;

import cn.maple.core.framework.controller.GXBaseController;
import cn.maple.core.framework.util.GXResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController implements GXBaseController {
    @GetMapping("/")
    public GXResultUtils<String> r() {
        return GXResultUtils.ok("Hello");
    }
}
