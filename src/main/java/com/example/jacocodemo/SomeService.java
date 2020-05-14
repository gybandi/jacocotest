package com.example.jacocodemo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SomeService {


    @Transactional
    public void doSomething() {
        System.out.println("Did something");
    }
}
