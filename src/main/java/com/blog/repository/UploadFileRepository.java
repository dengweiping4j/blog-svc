package com.blog.repository;

import com.blog.domain.Article;
import com.blog.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dengweiping
 */
@Repository
public interface UploadFileRepository extends JpaRepository<Article, String> {

}
