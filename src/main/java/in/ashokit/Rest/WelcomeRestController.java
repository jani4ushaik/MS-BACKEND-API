package in.ashokit.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "welcome to Ashokit";
     return msg;	
}
	
}
