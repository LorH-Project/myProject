package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Sms_message;

import java.util.List;

@Mapper
public interface SmsMapper {

    /**
     * 短信列表
     * @param content
     * @return
     */
    public List<Sms_message> smsList(@Param("content") String content,
                                     @Param("pageNo")Integer pageNo,
                                     @Param("pageSize")Integer pageSize);

    public int getSmsCount(@Param("content") String content);

    /**
     * 删除信息
     * @param messageId
     * @return
     */
    public int delSms(@Param("messageId") int messageId);
}
