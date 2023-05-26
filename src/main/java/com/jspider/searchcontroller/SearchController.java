package com.jspider.searchcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("home URL is fired up....!");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView process(@RequestParam("query") String search) {

		String url ="https://www.google.com/search?q=" + search;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);

		return redirectView;
	}
}
