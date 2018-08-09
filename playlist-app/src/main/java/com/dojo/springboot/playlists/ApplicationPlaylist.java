package com.dojo.springboot.playlists;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationPlaylist {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPlaylist.class, args);
		
	}

}
