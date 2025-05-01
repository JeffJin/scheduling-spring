package io.eworks.scheduling;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ScheduleCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) {
		// Do something...
		System.out.println("Command line runner inside ScheduleCommandLineRunner");
	}

}
