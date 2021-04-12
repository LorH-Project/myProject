package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.FeedBack;

import java.util.List;

@Mapper
public interface FeedBackMapper {
    /**
     * 意见反馈列表
     * @param userName
     * @param phone
     * @param commonProblemTitle
     * @param feedbackStatus
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<FeedBack> getFeedBackList(@Param("userName") String userName, @Param("phone") String phone, @Param("commonProblemTitle") String commonProblemTitle, @Param("feedbackStatus") int feedbackStatus, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     *建议类型倒序
     * @return
     */
    List<String> getCommonProblemTitleList();
    int getFeedBackTotal(@Param("userName") String userName,@Param("phone") String phone,@Param("commonProblemTitle") String commonProblemTitle,@Param("feedbackStatus") int feedbackStatus);

    /**
     * 修改备注
     * @param feedbackId
     * @param feedbackDesc
     * @return
     */
    int updateDescById(@Param("feedbackId") int feedbackId,@Param("feedbackDesc") String feedbackDesc);

    /**
     * 根据id查备注
     * @param feedbackId
     * @return
     */
    String getDescById(@Param("feedbackId") int feedbackId);

    /**
     * 根据id查对象
     * @param feedbackId
     * @return
     */
    FeedBack getContentById(@Param("feedbackId") int feedbackId);
}
