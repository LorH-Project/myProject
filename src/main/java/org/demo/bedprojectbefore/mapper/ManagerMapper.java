package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Sys_manager;


@Mapper
public interface ManagerMapper {
    //登录
    Sys_manager login(@Param("userAccount") String userAccount, @Param("passWord") String passWord);
}
