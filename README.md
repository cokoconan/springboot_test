# springboot_ex
springboot


### spring boot 연습해보기

1. 기본 프로젝트 생성

2. dependency 추가

        <parent>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>1.2.3.RELEASE</version>
        </parent>
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
            </dependency>
        </dependencies>

3. 간단하게 실행해보기
        
        package hello;
        
        import org.springframework.boot.*;
        import org.springframework.boot.autoconfigure.*;
        import org.springframework.stereotype.*;
        import org.springframework.web.bind.annotation.*;
        
        @Controller
        @EnableAutoConfiguration
        public class SampleController {
        
            @RequestMapping("/")
            @ResponseBody
            String home() {
                return "Hello World!";
            }
        
            public static void main(String[] args) throws Exception {
                SpringApplication.run(SampleController.class, args);
            }
        }


4. 로그 확인해보기.




*
        @Configuration
        @EnableAutoConfiguration
        @EntityScan
        				========> @SpringBootApplication
