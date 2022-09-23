package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDAO;

@RequiredArgsConstructor
@RestController
public class TestController {

	private final StadiumDAO stadiumDAO;
	
	@GetMapping({"","/"})
	public String test() {
		return "index";
	}
	
	@GetMapping("/stadium")
	public String stadiumTest() {
		return "stadium/stadium";
	}

	@PostMapping("/stadium")
	public @ResponseBody String stadiumInsertProcTest(Stadium stadium) {
		System.out.println("여긴 오나");
		System.out.println(stadium);
		stadiumDAO.insert(stadium);
		return "완료";
	}

	@GetMapping("/stadiumInsertForm")
	public String stadiumInsertFormTest() {
		return "stadium/stadiumInsertForm";
	}
}
