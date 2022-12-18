package com.linkedin.oauth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@ToString
public class PostStoryResponseDto {

    @JsonProperty("createdAt")
    private Date createdAt;

    @JsonProperty("lifecycleState")
    private String lifecycleState;

    @JsonProperty("lastModifiedAt")
    private Date lastModifiedAt;

    @JsonProperty("visibility")
    private String visibility;

    @JsonProperty("publishedAt")
    private Date publishedAt;

    @JsonProperty("author")
    private String author;

    @JsonProperty("id")
    private String uid;

    @JsonProperty("content")
    private PostContentDto content;

    @JsonProperty("commentary")
    private String commentary;

    @JsonProperty("lifecycleStateInfo")
    private LifecycleStateInfoDto lifecycleStateInfoDto;

}
