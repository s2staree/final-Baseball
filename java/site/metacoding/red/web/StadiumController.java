package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StadiumController {
	
	@GetMapping("/stadium")
	public String list() {
		return "stadium/list";
	}
}
