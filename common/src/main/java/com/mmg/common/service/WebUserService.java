package com.mmg.common.service;

import com.mmg.common.entity.WebUser;
import com.mmg.common.mapper.WebUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebUserService {
    @Autowired
    private WebUserMapper webUserMapper;
    public List<WebUser> webUser(){
        return webUserMapper.webuser();
    }
}
