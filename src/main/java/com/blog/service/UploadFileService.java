package com.blog.service;

import com.blog.domain.Article;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author dengweiping
 */
public interface UploadFileService {
    /**
     * 文件上传
     *
     * @param file
     * @return
     */
    Article uploadMdFile(MultipartFile file);
}
