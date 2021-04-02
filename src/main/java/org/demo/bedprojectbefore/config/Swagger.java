package org.demo.bedprojectbefore.config;

import io.swagger.models.Contact;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration//标记配置类
@EnableSwagger2//开启在线接口文档
public class Swagger {

    public Docket controllerApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("陪护床信息管理系统")
                        .description("用于对陪护床信息的查询和管理")
                        .version("版本号1.1.18")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.demo.bedprojectbefore.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
