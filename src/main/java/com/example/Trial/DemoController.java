package com.example.Trial;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class DemoController {

	@RequestMapping("/")
	public ResponseEntity<Demo> getDemo() {

		Demo demo = new Demo();
		demo.setStatusCode(200);
		demo.setMessage("This is sample application");
		return ResponseEntity.status(200).body(demo);
	}

	@RequestMapping("/{name}")
	public ResponseEntity<Demo> greetings(@PathVariable("name") String name) {
		Demo demo = new Demo();
		demo.setStatusCode(200);
		demo.setMessage("Hello " + name + ", nice to meet you!!");
		return ResponseEntity.status(200).body(demo);
	}
}
