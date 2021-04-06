package org.demo.bedprojectbefore.mapper;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Hospital;

import java.util.List;

@Mapper
public interface HospitalMapper {
    /**
     * 医院列表
     * @param hospitalName
     * @param address
     * @param linkName
     * @param linkPhone
     * @param companyName
     * @param pageNo
     * @param pageSize
     * @return
     */
    public List<Hospital> hospList(@Param("hospitalName") String hospitalName,
                                   @Param("address") String address,
                                   @Param("linkName") String linkName,
                                   @Param("linkPhone") String linkPhone,
                                   @Param("companyName") String companyName,
                                   @Param("pageNo")Integer pageNo,
                                   @Param("pageSize")Integer pageSize);

    /**
     * 医院总数据条数
     * @param hospitalName
     * @param address
     * @param linkName
     * @param linkPhone
     * @param companyName
     * @return
     */
    public int getHospCount(@Param("hospitalName") String hospitalName,
                            @Param("address") String address,
                            @Param("linkName") String linkName,
                            @Param("linkPhone") String linkPhone,
                            @Param("companyName") String companyName);
}
