package com.haust.myblog.dao;

import com.haust.myblog.entity.BlogConfig;

import java.util.List;


public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);

}