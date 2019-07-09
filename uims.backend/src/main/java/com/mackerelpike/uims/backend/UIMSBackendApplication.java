package com.mackerelpike.uims.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class UIMSBackendApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(UIMSBackendApplication.class, args);
    }
}
