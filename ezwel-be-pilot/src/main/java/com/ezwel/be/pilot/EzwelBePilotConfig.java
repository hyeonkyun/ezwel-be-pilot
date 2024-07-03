package com.ezwel.be.pilot;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration 
@MapperScan("com.ezwel.be.pilot.domain.repository")
public class EzwelBePilotConfig implements WebMvcConfigurer {

}
