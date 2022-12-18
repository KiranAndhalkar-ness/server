package com.linkedin.oauth;

import com.linkedin.oauth.pojo.LinkedInMasterModel;
import com.linkedin.oauth.service.LinkedInServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/linkedIn")
public class LinkedInController {

    @Autowired
    LinkedInServices linkedInServices;

    @GetMapping(value = "/posts")
    @ResponseBody
    public List<LinkedInMasterModel> getAllStories(){
        return linkedInServices.getAllStories();
    }


}
