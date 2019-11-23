package org.mashup.puppy.mock

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfiguration {
    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .groupName("org.mashup.puppy")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.mashup.puppy.mock"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
                .title("Kancho API")
                .description("Mash-Up Kancho")
                .termsOfServiceUrl("")
                .contact(Contact("forest.grass", "https://github.com/korea8378", "korea8378@naver.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .version("1.0")
                .build()
    }
}