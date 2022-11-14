package com.land.mall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class Swagger3Config {
    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.OAS_30)
                .groupName("Test")
                .apiInfo(webApiInfo())
                .enable(true)
                .select()
                .build();
    }
    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder()
                .title("Spring-Api文档")
                .description("测试SpringBoot")
                .version("1.0")
                .build();
    }
}
