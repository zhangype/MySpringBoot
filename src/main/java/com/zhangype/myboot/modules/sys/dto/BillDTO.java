package com.zhangype.myboot.modules.sys.dto;

/**
 * 账单DTO
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/7/19
 */
public class BillDTO {
    /**
     * 编号
     */
    private Long id;

    /**
     * 备注
     */
    private String remark;

    public BillDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
