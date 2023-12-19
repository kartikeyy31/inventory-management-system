package com.example.inventorymanagementsystem.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApiCalledEventListener {
    @EventListener
    public void onApiCalled(ApiCalledEvent event) {
        System.out.println("Received event: " + event.getMessage());
    }
}
