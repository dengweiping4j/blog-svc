package com.blog.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

/**
 * @author dengweiping
 */
@Entity
@Table(name = "basic_article")
@Data
public class Article {
    @Id
    private String pkid;
    private String title;
    private String abstractText;
    private String create_user;
    private Date update_time;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "content", columnDefinition = "BLOB")
    private byte[] content;
}
