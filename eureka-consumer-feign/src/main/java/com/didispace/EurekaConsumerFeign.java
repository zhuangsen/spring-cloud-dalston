package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeign {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaConsumerFeign.class).web(true).run(args);
	}

}
