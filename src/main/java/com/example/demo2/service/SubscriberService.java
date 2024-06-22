package com.example.demo2.service;

import com.example.demo2.models.Subscriber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SubscriberService {
    private List<Subscriber> subscriberList =new ArrayList<>();
    private AtomicInteger id = new AtomicInteger(0);

    public List<Subscriber> findAll(){
        return subscriberList;
    }
    public void create(String email){
        subscriberList.add(new Subscriber(id.addAndGet(1),email));

    }
}
