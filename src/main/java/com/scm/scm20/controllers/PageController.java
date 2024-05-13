package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PageController {

  @RequestMapping("/home")
  public String homePage(Model model){
    System.out.println("home page handler");

    //sending data to view
    model.addAttribute("Name", "Jagdeesh Rajpoot");
    model.addAttribute("YoutubeChannel", "Darksline haks");
    model.addAttribute("Github", "https://github.com/JagdeeshSinghRajpoot");
    return "home";
  }

  //About
  @RequestMapping("/about")
  public String aboutPage(Model model) {
    model.addAttribute("isLogin",true);
      System.out.println("About page loading");
      return "About";
  }
  
  //services
  @RequestMapping("/services")
  public String servicesPage(){
    System.out.println("services page loading");
    return "services";
  }

}
