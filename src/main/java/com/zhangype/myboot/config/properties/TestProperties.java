package com.zhangype.myboot.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangype@yonyou.com
 * @version V1.0.0
 * @date 2017/12/11
 */
@ConfigurationProperties(prefix = "test")
@Component
public class TestProperties {

    private String value;

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
