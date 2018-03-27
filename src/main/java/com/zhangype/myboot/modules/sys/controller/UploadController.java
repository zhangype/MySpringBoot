package com.zhangype.myboot.modules.sys.controller;

import com.zhangype.myboot.Result;
import com.zhangype.myboot.common.utils.ResultUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传Controller
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/3/27
 */
@RestController
@RequestMapping(value = "/sys/upload")
public class UploadController {

    @PostMapping(value = "/file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Result handleFile(@RequestPart(value = "file") MultipartFile file) {
        return ResultUtils.success(file.getOriginalFilename());
    }

}
