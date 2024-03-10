package com.mmg.common.mapper;

import com.mmg.common.entity.WebUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WebUserMapper {
    List<WebUser> webuser();
}
