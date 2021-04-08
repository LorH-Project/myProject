package org.demo.bedprojectbefore.service;

import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.mapper.HospitalMapper;
import org.demo.bedprojectbefore.pojo.Hospital;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HospSer {

    @Resource
    private HospitalMapper hospitalMapper;

    public List<Hospital> hospList(@Param("hospitalName") String hospitalName,
                                   @Param("address") String address,
                                   @Param("linkName") String linkName,
                                   @Param("linkPhone") String linkPhone,
                                   @Param("companyName") String companyName,
                                   @Param("pageNo")Integer pageNo,
                                   @Param("pageSize")Integer pageSize) {
        return hospitalMapper.hospList(hospitalName, address, linkName, linkPhone, companyName, (pageNo-1)*pageSize, pageSize);
    }

    public int getHospCount(@Param("hospitalName") String hospitalName,
                            @Param("address") String address,
                            @Param("linkName") String linkName,
                            @Param("linkPhone") String linkPhone,
                            @Param("companyName") String companyName){
        return hospitalMapper.getHospCount(hospitalName, address, linkName, linkPhone, companyName);
    }
    public int delHosp(@Param("id") int id){
        return hospitalMapper.delHosp(id);
    }
}
