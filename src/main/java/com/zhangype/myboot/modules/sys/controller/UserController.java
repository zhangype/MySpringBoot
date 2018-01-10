package com.zhangype.myboot.modules.sys.controller;

import com.zhangype.myboot.Result;
import com.zhangype.myboot.common.utils.ResultUtils;
import com.zhangype.myboot.config.properties.TestProperties;
import com.zhangype.myboot.modules.sys.entity.User;
import com.zhangype.myboot.modules.sys.model.UserModel;
import com.zhangype.myboot.modules.sys.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 用户Controller
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2017/11/24
 */
@RestController
@RequestMapping(value = "/sys/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private TestProperties properties;

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public Result login(@RequestBody @Valid UserModel loginModel) {
        userService.findUserByAccount(loginModel.getAccount());
        logger.info("value={}", properties.getValue());
        return ResultUtils.success();
    }

    @PostMapping(value = "/info")
    public Result getUserInfo(@RequestBody @Valid UserModel userModel) {
        User user = new User();
        user.setAccount(userModel.getAccount());
        return ResultUtils.success(user);
    }

}
