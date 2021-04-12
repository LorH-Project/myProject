package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.AgentMapper;
import org.demo.bedprojectbefore.pojo.Agent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AgentSer {
    @Resource
    private AgentMapper agentMapper;

    public List<Agent> selAgent(){
        return agentMapper.selAgent();
    }
}
