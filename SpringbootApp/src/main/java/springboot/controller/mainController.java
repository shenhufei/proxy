package springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {








	@RequestMapping("/home")
	public String message() {
		return "BAM!";
	}

}
