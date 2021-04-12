package org.demo.bedprojectbefore.controller;

import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.pojo.Agent;
import org.demo.bedprojectbefore.service.AgentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class AgentController {

    @Resource
    private AgentSer agentSer;

    @ApiIgnore
    @RequestMapping(value = "/selAgent",method = RequestMethod.GET)
    public Dto selAgent(){
        List<Agent> agentList=agentSer.selAgent();
        System.out.println(agentList.size());
        if(agentList!=null){
            return DtoUtil.returnSuccess(agentList);
        }
        return DtoUtil.returnSuccess("未查到数据",404);
    }
}
