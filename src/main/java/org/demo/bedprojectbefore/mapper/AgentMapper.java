package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.bedprojectbefore.pojo.Agent;

import java.util.List;

@Mapper
public interface AgentMapper {
    /**
     * 所属代理商
     * @return
     */
    public List<Agent> selAgent();
}
