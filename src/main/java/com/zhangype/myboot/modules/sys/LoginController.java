package com.zhangype.myboot.modules.sys;

import com.zhangype.myboot.config.properties.TestProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangype@yonyou.com
 * @version V1.0.0
 * @date 2017/11/24
 */
@RestController
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private TestProperties properties;

    @RequestMapping("/")
    public String home() {
        LOGGER.info("value={}", properties.getValue());
        return "Hello World!" + properties.getValue();
    }
}
