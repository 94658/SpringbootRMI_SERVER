package com.example.demo.service;

import java.util.Date;

public class HelloWorldRMIimplService implements HelloWorldRMIService {

   //the service we want to expose
    @Override
    public String printHelloWorld(String msg) {
        System.out.println("================Server Side ========================");
        System.out.println("Inside Rmi IMPL - Incoming msg : " + msg);
        return "Hello " + msg + " :: Response time - > " + new Date();
    }

}
