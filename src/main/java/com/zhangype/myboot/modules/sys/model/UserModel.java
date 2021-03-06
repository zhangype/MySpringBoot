package com.zhangype.myboot.modules.sys.model;

/**
 * 用户Model
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2017/12/29
 */
public class UserModel {
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String passWord;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
