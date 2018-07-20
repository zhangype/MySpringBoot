package com.zhangype.myboot.modules.sys.controller;

import com.zhangype.myboot.modules.sys.dto.BillDTO;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 账单Controller
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/7/19
 */
@RestController
@RequestMapping(value = "/sys/bill")
public class BillController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/info")
    public List<BillDTO> getInfo(String ids) {
        List<BillDTO> billDTOList = new ArrayList<>();
        String[] idList = StringUtils.split(ids, ",");
        for (String id : idList) {
            billDTOList.add(new BillDTO(Long.valueOf(id)));
        }
        return billDTOList;
    }

    @PostMapping("/info/{id}")
    public BillDTO login(@PathVariable Integer id) {
        return new BillDTO(Long.valueOf(id));
    }
}
