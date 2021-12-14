package kr.or.fineappledemo1.service.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
public class UserController {

    @RequestMapping(value="login")
    public String login(){
     System.out.println("login");
    	return "user/login.html";
    }

}
