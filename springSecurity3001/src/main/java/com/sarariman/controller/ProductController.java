package com.sarariman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/add")
	public String add() {
		return "product/add";
	}
	
	@RequestMapping(value = "/update")
	public String update() {
		return "product/update";
	}
	
	@RequestMapping(value = "/list")
	public String list() {
		return "product/list";
	}
	
	@RequestMapping(value = "/delete")
	public String delete() {
		return "product/delete";
	}

}
