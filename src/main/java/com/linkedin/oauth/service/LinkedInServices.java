package com.linkedin.oauth.service;

import com.linkedin.oauth.pojo.LinkedInMasterModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LinkedInServices {

    List<LinkedInMasterModel> getAllStories();
}
