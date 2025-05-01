package io.eworks.scheduling.listeners;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ScheduleAppReadinessStateExporter {
    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC -> {
                // create file /tmp/healthy
                System.out.println("accepting traffic, logging to heath file");
            }
            case REFUSING_TRAFFIC -> {
                // remove file /tmp/healthy
                System.out.println("refusing traffic, logging to heath file");
            }
        }
    }
}
