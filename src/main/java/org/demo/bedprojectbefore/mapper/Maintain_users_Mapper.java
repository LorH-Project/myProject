package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Agent;
import org.demo.bedprojectbefore.pojo.Maintain_users;

import java.util.List;
@Mapper
public interface Maintain_users_Mapper {

    /**
     * 维护人员列表
     * @param realName
     * @param userPhone
     * @param agentId
     * @return
     */
    public List<Maintain_users> mainUserList(@Param("realName") String realName,
                                             @Param("userPhone") String userPhone,
                                             @Param("agentId") Integer agentId,
                                             @Param("pageNo")Integer pageNo,
                                             @Param("pageSize")Integer pageSize);

    public int getMainCount(@Param("realName") String realName,
                            @Param("userPhone") String userPhone,
                            @Param("agentId") Integer agentId);

    /**
     *负责医院
     * @param hospitalIds
     * @return
     */
    List<String> getHospitalList(@Param("hospitalIds") String[] hospitalIds);

    /**
     * 删除维护人员
     * @param maintainId
     * @return
     */
    public int delMain(@Param("maintainId") int maintainId);



}
