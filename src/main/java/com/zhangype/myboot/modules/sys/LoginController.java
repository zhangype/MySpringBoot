package com.zhangype.myboot.modules.sys;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangype@yonyou.com
 * @version V1.0.0
 * @date 2017/11/24
 */
@RestController
public class LoginController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
