package com.coderode.Kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesApplication.class, args);
	}

	@GetMapping("/greetings")
	public String message() {
		return "Welcome to CodeRode ! App deployed in AWS EKS - Dev";
	}
}
