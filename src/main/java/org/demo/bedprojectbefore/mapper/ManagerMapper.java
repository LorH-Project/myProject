package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Sys_manager;


@Mapper
public interface ManagerMapper {
    Sys_manager login(@Param("username") String username, @Param("password") String password);
}
