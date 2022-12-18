package com.linkedin.oauth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PostContentDto {

    @JsonProperty("media")
    private MediaDto media;

    @JsonProperty("article")
    private ArticleDto article;


}
