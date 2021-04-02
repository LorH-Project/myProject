package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.User;

import java.util.List;


@Mapper
public interface UserMapper {
    //带条件查询用户列表（无分页）
    public List<User> getUserList(@Param("nickName") String nickName,
                                  @Param("userPhone") String userPhone,
                                  @Param("isDeposit") String isDeposit,
                                  @Param("isFlag") String isFlag);

}