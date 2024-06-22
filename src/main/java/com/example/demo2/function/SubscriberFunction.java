package com.example.demo2.function;

import com.example.demo2.models.Subscriber;
import com.example.demo2.service.SubscriberService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
@RequiredArgsConstructor
public class SubscriberFunction {

    private final SubscriberService subscriberService;

    @Bean
    public Consumer<String> create(){
        return email -> subscriberService.create(email);
    }

    @Bean
    public Supplier<List<Subscriber>> findAll(){
        return ()->subscriberService.findAll();
    }
}
