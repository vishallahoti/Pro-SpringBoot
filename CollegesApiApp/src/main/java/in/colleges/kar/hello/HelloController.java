package in.colleges.kar.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/colleges")
	String sayHello() {
		return "Hello!";
	}
	
	

}
