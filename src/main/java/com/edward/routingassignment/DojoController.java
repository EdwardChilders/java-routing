package com.edward.routingassignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/dojo")
	public String dojo() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/burbank-dojo")
	public String burbank() {
		return "Burbank Dojo is located in Southern California";
	}
	
	@RequestMapping("/san-jose")
	public String sj() {
		return "SJ dojo is the headquarters";
	}
}
