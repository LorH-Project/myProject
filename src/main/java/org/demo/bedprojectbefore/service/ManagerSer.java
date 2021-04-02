package org.demo.bedprojectbefore.service;

import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Sys_manager;

public interface ManagerSer {

    Sys_manager login(@Param("username") String username, @Param("password") String password);
}
