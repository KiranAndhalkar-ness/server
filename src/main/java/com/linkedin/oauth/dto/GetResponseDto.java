package com.linkedin.oauth.dto;

import com.linkedin.oauth.util.DateUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@ToString
public class GetResponseDto {

    private int id;

    private String createdAt;

    private String lifecycleState;

    private String lastModifiedAt;

    private String visibility;

    private String publishedAt;

    private String author;

    private String uid;

    private String commentary;

    private String contentMediaId;

    private String description;

    private String thumbnail;

    private String source;

    private String title;

    private boolean isEditedByAuthor;

    public void setCreatedAt(Date createdAt){
        this.createdAt = DateUtil.convertDateToWelkinFormat(createdAt);
    }

}
