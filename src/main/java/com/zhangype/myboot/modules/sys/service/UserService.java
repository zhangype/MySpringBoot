package com.zhangype.myboot.modules.sys.service;

import com.zhangype.myboot.modules.sys.entity.User;
import com.zhangype.myboot.modules.sys.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户Service
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2017/12/29
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUserByAccount(String account) {
        return userDao.selectUserByAccount(account);
    }
}
