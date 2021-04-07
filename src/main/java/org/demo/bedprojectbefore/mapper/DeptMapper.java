package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {

    /**
     * 科室列表
     * @param hospitalName
     * @param address
     * @param deptName
     * @return
     */
    public List<Dept> deptList(@Param("hospitalName")String hospitalName,@Param("address") String address,
                               @Param("deptName")String deptName,@Param("pageNo")Integer pageNo,
                               @Param("pageSize")Integer pageSize);

    public int getDeptCount(@Param("hospitalName")String hospitalName,@Param("address") String address,
                            @Param("deptName")String deptName);

    public int delDept(@Param("deptId")Integer deptId);
}
