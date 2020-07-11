package com.elearntez.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(ModelMap map){
		map.addAttribute("Message", "Welcome to Spring MVC");
		return "hello";
	}
	
	
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String sayHi(ModelMap map){
		map.addAttribute("Message", "Hello MyDear. Welcome to Spring MVC. ");
		return "hello";
	}

}
