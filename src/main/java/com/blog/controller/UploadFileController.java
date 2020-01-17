package com.blog.controller;

import com.blog.domain.Article;
import com.blog.service.UploadFileService;
import com.blog.util.CustomResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author dengweiping
 */
@RestController
@RequestMapping("/upload")
public class UploadFileController {
    @Autowired
    private UploadFileService uploadFileService;

    @RequestMapping(value = "uploadMdFile", method = RequestMethod.POST)
    @ResponseBody
    public CustomResult uploadMdFile(MultipartFile file) {
        Article article=uploadFileService.uploadMdFile(file);
        if(article!=null){
            return CustomResult.success();
        }
        return CustomResult.error();
    }
}
