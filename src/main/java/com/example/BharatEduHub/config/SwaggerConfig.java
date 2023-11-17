//package com.example.BharatEduHub.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket postsApi() {
//        return new Docket(DocumentationType.SWAGGER_2).groupName("BharatEduHub").apiInfo(apiInfo()).select()
//                .paths(regex("/bharateduhub.*")).build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("Book Service")
//                .description("Documentation of API for BharatEduHub")
//                .termsOfServiceUrl("")
//                .license("Bharat EduHub API")
//                .licenseUrl("").version("1.0").build();
//    }
//}
