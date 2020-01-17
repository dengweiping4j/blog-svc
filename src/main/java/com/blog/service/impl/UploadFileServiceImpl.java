package com.blog.service.impl;

import com.blog.domain.Article;
import com.blog.repository.UploadFileRepository;
import com.blog.service.UploadFileService;
import com.blog.util.CustomResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author dengweiping
 */
@Component
public class UploadFileServiceImpl implements UploadFileService {
    @Autowired
    private UploadFileRepository uploadFileRepository;

    @Override
    public Article uploadMdFile(MultipartFile file) {
        Article article=new Article();
        return uploadFileRepository.save(article);
    }
}
