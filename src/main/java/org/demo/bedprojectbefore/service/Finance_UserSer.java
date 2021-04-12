package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.Finance_UserMapper;
import org.demo.bedprojectbefore.pojo.Finance_User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Finance_UserSer{

    @Resource
    private Finance_UserMapper finance_userMapper;

    public List<Finance_User> FinaList(String outTradeNo, String nickName, int financeType, String start, String end, int pageNo, int pageSize) {
            pageNo=(pageNo-1)*pageSize;
          return finance_userMapper.FinaList(outTradeNo,nickName,financeType,start,end,pageNo,pageSize);
    }

    public int getFinaCount(String outTradeNo, String nickName, int financeType, String start, String end) {
        return finance_userMapper.getFinaCount(outTradeNo,nickName,financeType,start,end);
    }
}
