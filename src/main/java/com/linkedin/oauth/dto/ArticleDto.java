package com.linkedin.oauth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Getter
@Setter
@ToString
public class ArticleDto {

    @JsonProperty("description")
    private String description;

    @JsonProperty("thumbnail")
    private String thumbnail;

    @JsonProperty("source")
    private String source;

    @JsonProperty("title")
    private String  title;
}
