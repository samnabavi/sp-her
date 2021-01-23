package com.hcl.swagger;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	//it create document internally and implicity it should provide restendpoint
	//called /swagger-ui.html
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}
	
//	@Bean
//    public Docket postsApi() {
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com"))
//                .build();
//    }
	
	
	

	private Predicate<String> postPaths() {
		// TODO Auto-generated method stub
		return or(regex("/.*"));
	}

	private ApiInfo apiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder().title("Sam Ecommerce")
				.description("Welcome to my ecommerce")
				.termsOfServiceUrl("http://sam/com")
				.contact("sam@gmail.com")
				.licenseUrl("sam@gmail.com")
				.version("1.0")
				.build();
	}
	
}
