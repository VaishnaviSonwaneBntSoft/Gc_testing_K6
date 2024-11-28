package com.gc.k6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GcTestingK6Application {

	public static void main(String[] args) {
		SpringApplication.run(GcTestingK6Application.class, args);
	}

}

@RestController
@RequestMapping("/gc/k6")
class HelloWorld
{
	@GetMapping("/hello-world")
	public ResponseEntity<String> helloWorld()
	{
		return ResponseEntity.ok("Hello World");
	}
}
