package com.example.demo.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.multi.service.MultiService;

@Controller
public class MultiController {

	private final MultiService MultiService;

	public MultiController(MultiService MultiService) {
		this.MultiService = MultiService;
	}

	@GetMapping("multi")
	public String Multi(Model model) {
		String result = "";

		result = String.valueOf(MultiService.Multi(5, 6));

		model.addAttribute("result", result);

		return "multi.html";
	}
}