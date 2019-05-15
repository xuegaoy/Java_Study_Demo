package cn.sarariman.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("product")
public class ProductController {

    @RequestMapping("add")
    public String add(){
        return "product/add";
    }

    @RequestMapping("update")
    public String update(){
        return "product/update";
    }

    @RequestMapping("delete")
    public String delete(){
        return "product/delete";
    }

    @RequestMapping("list")
    public String list(){
        return "product/list";
    }
}
