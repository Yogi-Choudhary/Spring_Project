package co.in.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	// need a controller method to show the initial HTML from
	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}
