package gic.i4gic.robotapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	@GetMapping("/tp14/task1")
	public String index() {
		return "task1";
	}
	@GetMapping("/tp14/task2")
	public String index1() {
		return "task2";
	}
	@GetMapping("/tp14/task3")
	public String index2() {
		return "task3";
	}
	@GetMapping("/tp14/task4")
	public String index3() {
		return "task4";
	}
	@GetMapping("/tp14/task5")
	public String index4() {
		return "task5";
	}
}
