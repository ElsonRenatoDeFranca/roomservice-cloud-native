# roomservice-cloud-native

Spring has given a starter project for actually becoming a client of the config server. One of benefits of using that client, it is allows us to bootstrap to that config server and get our config at the appropriate point of bean lifecycle. 

A cloud native webservice must be developed with the following changes in mind:

1- The roomservice must be registered to Eureka server as an Eureka client. We must do that by adding the following annotation to the main class:

@SpringBootApplication
@EnableDiscoveryClient
public class RoomCloudNativeMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(RoomCloudNativeMicroservice.class, args);
	}
}

2- We also need to add the following dependencies to the pom.xml file:

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
    
    <properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
		<spring-cloud.version>Greenwich.SR1</spring-cloud.version>
    </properties>

