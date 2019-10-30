package com.example.demo;

import com.example.demo.service.HelloWorldRMIService;
import com.example.demo.service.HelloWorldRMIServiceImpl;
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
        exporter.setServiceName("helloworldrmiservice"); //endpoint name
        exporter.setServiceInterface(HelloWorldRMIService.class); //class of the interface we want to publish
        exporter.setService(new HelloWorldRMIServiceImpl());  //instance of the service implementation class
        return exporter;
        }
    }

