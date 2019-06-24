# roomservice-cloud-native


Add these dependencies for enabling the roomservice to be registered by Eureka Service Discovery

<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-config</artifactId>
</dependency>

<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka</artifactId>
			<version>1.4.7.RELEASE</version>
</dependency>

<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>


Change the main application to work as Eureka Client

package com.hotelreservation.microservices.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration(exclude = RepositoryRestMvcAutoConfiguration.class)
@EntityScan("com.hotelreservation.microservices.entity")
@EnableJpaRepositories("com.hotelreservation.microservices.repository")
@ComponentScan({"com.hotelreservation.microservices.converter","com.hotelreservation.microservices.controller", "com.hotelreservation.microservices.service", "com.hotelreservation.microservices.service.impl"})
@EnableCaching
@EnableSwagger2
@EnableDiscoveryClient
public class RoomCloudNativeMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(RoomCloudNativeMicroservice.class, args);
	}
}
