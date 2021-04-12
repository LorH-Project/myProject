package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Sys_manager;

import java.util.List;


@Mapper
public interface ManagerMapper {
    //登录
    Sys_manager login(@Param("userAccount") String userAccount, @Param("passWord") String passWord);

    int insManager(Sys_manager sys_manager);
    int updPassword(@Param("userAccount") String userAccount,@Param("oldPassword") String oldPassword,@Param("newPassword") String newPassword);
    /*待条件查询*/
    List<Sys_manager> getManagerList(@Param("userAccount") String userAccount, @Param("userName") String userName, @Param("userPhone") String userPhone, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    int getManagerCount(@Param("userAccount") String userAccount,@Param("userName") String userName,@Param("userPhone") String userPhone);
    /*重置*/
    int updatePassword(int agentId);
    Sys_manager sys_manager(int agentId);/*根据agentID查询所有对象*/
    List<Sys_manager> getSys_manager_ByPhone(@Param("userPhone") String userPhone);/*根据电话查询所有对象*/



    /*删除*/
    int delById(int managerId);
    /*冻结*/
    int updIsFlag(@Param("managerId") int managerId,@Param("isFlag") int isFlag);

    int updPwd(@Param("managerId") int managerId,@Param("pwd") String pwd);
    /*编辑*/
    int updManager(@Param("managerId") int managerId,@Param("userName") String userName,@Param("userAccount") String userAccount,@Param("userPhone") String userPhone);
    /*绑定角色*/
    int insRole(@Param("managerId") int managerId,@Param("roleId") int roleId);
}
