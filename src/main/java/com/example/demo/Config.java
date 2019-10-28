package com.example.demo;

import com.example.demo.service.HelloWorldRMIService;
import com.example.demo.service.HelloWorldRMIimplService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class Config  {

    //Register the services here and expose it using an endpoint
    @Bean
    RemoteExporter registerRMI(){

        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("helloworldrmiservice");
        exporter.setServiceInterface(HelloWorldRMIService.class);
        exporter.setService(new HelloWorldRMIimplService());
        return exporter;
        }
    }

