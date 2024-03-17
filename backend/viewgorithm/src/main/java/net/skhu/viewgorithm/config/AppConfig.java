package net.skhu.viewgorithm.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// import com.ace.skream.user.commons.interceptor.SessionInterceptor;

// 이미지 파일 경로 설정
@Configuration
@EnableWebMvc
@EnableScheduling
public class AppConfig implements WebMvcConfigurer{

    @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {


        // 아래 3개 폴더 생성
        // /static/public/js
        // /static/public/css
        // /static/public/image

        
        registry.addResourceHandler("/public/**")
            .addResourceLocations("classpath:/static/public/")
            // .setCachePeriod(60 * 60 * 24 * 365);
        ;  
        
        // 업로드 외부 파일 
        registry.addResourceHandler("/uploadFiles/**")
            .addResourceLocations("file://C:/uploadFiles/")
            // .setCachePeriod(60 * 60 * 24 * 365);
        ;  
	}    

}




