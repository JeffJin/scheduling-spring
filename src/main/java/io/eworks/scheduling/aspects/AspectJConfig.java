package io.eworks.scheduling.aspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "io.eworks.scheduling")
public class AspectJConfig {
    @Bean
    public LoggingAspect getLogAspect() {
        return new LoggingAspect();
    }
    @Bean
    public ProfilingAspect getProfileAspect() {
        return new ProfilingAspect();
    }
}