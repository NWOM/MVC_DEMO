package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//spring mvc application creation steps
// 1 Configure the Dispatcher Servlet in web.xml
// 2 Create Spring Config File
// 3 Configure View Resolver
// 4 Create Controller
// 5 Crete a view to show page
@Controller //to make any class Controller in spring MVC
public class HomeController {
    @RequestMapping("/home") //when ever we will fire /home  this homecobtroller will activate and method will display index as view
    //then our viewresolver wll resolve index and view wil be   <!-- /WEB-INF/views/index.jsp-->
    public String home(){
        System.out.println("this is home url");
        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        System.out.println("this is about controller");
        return "about";
    }
}
