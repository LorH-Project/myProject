package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Fault_Feedback;

import java.util.List;

@Mapper
public interface Fault_FeedbackMapper {
    List<Fault_Feedback> getFaultList(@Param("deviceNumber") String deviceNumber, @Param("feedbackType") int feedbackType, @Param("nickName") String nickName, @Param("userPhone") String userPhone, @Param("status") int status, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    int getFaultCount(@Param("deviceNumber") String deviceNumber,@Param("feedbackType") int feedbackType,@Param("nickName") String nickName,@Param("userPhone") String userPhone,@Param("status") int status);
    int updateDesc(@Param("feedbackId") int feedbackId,@Param("feedbackDesc") String feedbackDesc);
}
