package org.demo.bedprojectbefore.service;

import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.User;

import java.util.List;

public interface UserSer {

    public List<User> getUserList(@Param("nickName") String nickName,
                                  @Param("userPhone") String userPhone,
                                  @Param("isDeposit") int isDeposit,
                                  @Param("isFlag") int isFlag);
}
