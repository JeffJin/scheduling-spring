package io.eworks.scheduling;

import io.eworks.scheduling.aspects.AspectJConfig;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SchedulingApplication {

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SchedulingApplication.class);
		//TODO: WebFlux
//		application.setWebApplicationType(WebApplicationType.REACTIVE);
		application.setBannerMode(Banner.Mode.CONSOLE);
		application.run(args);
//		SpringApplication.run(SchedulingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Generic command line runner inside SchedulingApplication");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}

		};
	}
}

