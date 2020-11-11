package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member", // 탐색 패키지의 시작 위치를 지정. 전체 스캔 시에는 탐색 시간이 오래걸릴 수 있음...
//        basePackageClasses = AutoAppConfig.class, // 지정한 클래스의 패키지를 탐색 시작 위로 지정한다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


}
