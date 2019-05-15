package cn.sarariman.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
	
	@RequestMapping(value = "/index")
	public String index(Model model)
	{
		//获取登陆后的用户
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal!=null){
			if (principal instanceof UserDetails){
				UserDetails userDetails = (UserDetails) principal;
				String userName = userDetails.getUsername();
				model.addAttribute("username",userName);
			}
		}
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
