package com.zhangype.myboot.modules.sys.mapper;

import com.zhangype.myboot.modules.sys.entity.User;

/**
 * 用户信息Dao
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2017/12/29
 */
public interface UserDao {

    User selectUserByAccount(String account);
}
