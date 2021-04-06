package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("医院管理")
@RestController
@RequestMapping(value = "hosp/*")
@CrossOrigin
public class HospController {



}
