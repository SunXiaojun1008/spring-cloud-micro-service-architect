package com.xj.sun.configclientrefreshbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientRefreshBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientRefreshBusApplication.class, args);
	}
}
