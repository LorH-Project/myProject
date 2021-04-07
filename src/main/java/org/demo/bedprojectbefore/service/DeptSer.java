package org.demo.bedprojectbefore.service;

import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.mapper.DeptMapper;
import org.demo.bedprojectbefore.pojo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptSer {

    @Resource
    private DeptMapper deptMapper;

    public List<Dept> deptList(@Param("hospitalName")String hospitalName, @Param("address") String address,
                               @Param("deptName")String deptName, @Param("pageNo")Integer pageNo,
                               @Param("pageSize")Integer pageSize){
        return deptMapper.deptList(hospitalName, address, deptName, pageNo, pageSize);
    }

    public int getDeptCount(@Param("hospitalName")String hospitalName,@Param("address") String address,
                            @Param("deptName")String deptName){
        return deptMapper.getDeptCount(hospitalName, address, deptName);
    }

    public int delDept(@Param("deptId")Integer deptId){
        return deptMapper.delDept(deptId);
    }
}
