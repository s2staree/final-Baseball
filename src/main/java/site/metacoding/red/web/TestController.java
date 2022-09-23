package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDAO;

@RequiredArgsConstructor
@Controller
public class TestController {

	private final StadiumDAO stadiumDAO;
	
	@GetMapping({"","/"})
	public String test() {
		return "index";
	}
	
	@GetMapping("/stadium")
	public String stadiumTest(Model model) {
		model.addAttribute("stadiums", stadiumDAO.findAll());
		return "stadium/stadium";
	}
	
	@GetMapping("test/stadium")
	public @ResponseBody List<Stadium> stadiumTest() {
		return stadiumDAO.findAll();
	}

	@PostMapping("/stadium")
	public @ResponseBody String stadiumInsertProcTest(Stadium stadium) {
		System.out.println("@PostMapping" + stadium);
		stadiumDAO.insert(stadium);
		return "완료";
	}
	
	@DeleteMapping("/stadium")
	public @ResponseBody String stadiumDeleteProcTest(int id) {
		System.out.println("@DeleteMapping" + id);
		stadiumDAO.deleteById(id);
		return "완료";
	}

	@PutMapping("/stadium")
	public @ResponseBody String stadiumUpdateProcTest(Stadium stadium) {
		System.out.println("@PutMapping" + stadium);
		stadiumDAO.update(stadium);
		return "완료";
	}

	@GetMapping("/stadiumInsertForm")
	public String stadiumInsertFormTest() {
		return "stadium/stadiumInsertForm";
	}
	
	@GetMapping("/stadiumUpdateForm/{id}/{name}")
	public String stadiumUpdateFormTest(@PathVariable int id,@PathVariable String name,Model model) {
		System.out.println(id+","+name);
		Stadium stadium = stadiumDAO.findByIdAndName(id, name);
		model.addAttribute("stadium", stadium);
		return "stadium/stadiumUpdateForm";
	}
}
