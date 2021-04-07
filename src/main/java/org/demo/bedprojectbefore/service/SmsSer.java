package org.demo.bedprojectbefore.service;

import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.mapper.SmsMapper;
import org.demo.bedprojectbefore.pojo.Sms_message;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SmsSer {

    @Resource
    private SmsMapper smsMapper;

    public List<Sms_message> smsList(@Param("content") String content,
                                     @Param("pageNo")Integer pageNo,
                                     @Param("pageSize")Integer pageSize){
        return smsMapper.smsList(content,pageNo,pageSize);
    }

    public int getSmsCount(@Param("content") String content) {
        return smsMapper.getSmsCount(content);
    }

    /**
     * 删除信息
     * @param messageId
     * @return
     */
    public int delSms(@Param("messageId") int messageId) {
        return smsMapper.delSms(messageId);
    }
}
