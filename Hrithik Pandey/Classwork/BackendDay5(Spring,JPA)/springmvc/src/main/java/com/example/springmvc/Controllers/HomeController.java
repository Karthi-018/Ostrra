package com.example.springmvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
    @RequestMapping("/x")
   public String getHomepage(){
        return "index.html";
   }
   @RequestMapping("/sub")
   public ModelAndView getnp(String val){
     ModelAndView mv= new ModelAndView();
        mv.addObject("val",val);
        mv.setViewName("next.jsp");
          return mv;
   }
}
