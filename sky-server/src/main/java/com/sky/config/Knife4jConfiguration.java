package com.sky.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Knife4jConfiguration {

    // 指定扫描controller的包路径
    private String basePackage = "com.sky.controller";

    // 主机名
    private String host = "localhost";

    private String title = "苍穹外卖项目接口文档";

    private String description = "苍穹外卖项目接口文档";

    private String contactName = "coderedma";

    private String contactUrl = "http://coderedma.com";
    private String contactEmail = "3114867971@qq.com";

    private String version = "2.0";

    /**
     * 创建并配置ApiInfo对象，用于设置Swagger文档的基本信息
     * @return 配置好的ApiInfo对象
     */

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .version(version)
                .contact(new Contact(contactName,contactUrl,contactEmail))
                .build();
    }

    @Bean
    public Docket docket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .host(host)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

}
