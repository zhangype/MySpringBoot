package com.zhangype.myboot.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 自定义Properties
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2017/12/11
 */
@Component
@ConfigurationProperties(prefix = "test")
public class TestProperties {

    /**
     * 数据
     */
    private String value;

    /**
     * 加密数据
     */
    private String encValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getEncValue() {
        return encValue;
    }

    public void setEncValue(String encValue) {
        this.encValue = encValue;
    }
}
