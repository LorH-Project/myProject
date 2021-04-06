package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.bedprojectbefore.pojo.Hospital;

import java.util.List;

@Mapper
public interface HospitalMapper {
    public List<Hospital> hospList(String hospitalName);
}
