package kr.or.fineappledemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
     System.out.println("rrrrrr");
    	return "front/index.html";
    }

}
