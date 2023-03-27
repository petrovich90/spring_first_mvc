package by.mysite.controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ParamController {

    @GetMapping(value = "/getParams")
    public String getParams(HttpServletRequest request){
        String stringParam = request.getParameter("param1");
        int intParam = Integer.parseInt(request.getParameter("param2"));
        request.setAttribute("stringParam", stringParam);
        request.setAttribute("intParam", intParam);

        return "main";
    }
    @GetMapping(value = "/getParamsSpring")
    public String getParamsSpringApproach(@RequestParam(name = "param1") String name,
                                          @RequestParam(name = "param2", required = false) Integer id,
                                          HttpServletRequest request){
        request.setAttribute("stringParam", name);
        request.setAttribute("intParam", id);


        return "main";
    }

    @GetMapping(value = "/passParamsToSession")
    public String passParamsToSession(@RequestParam(name = "param1") String name,
                                      @RequestParam(name = "param2", required = false) Integer id,
                                      HttpSession session){
        session.setAttribute("stringParam", name);
        session.setAttribute("intParam", id);


        return "main";
    }

    @GetMapping(value = "/paramsAsUrlPart/{param1}/{param2}")
    public String passParamsAsUrlPart(@PathVariable(name = "param1") String name,
                                      @PathVariable(name = "param2", required = false) Integer id,
                                      Model model){
        model.addAttribute("stringParam", name);
        model.addAttribute("intParam", id);


        return "main";
    }

    @GetMapping(value = "/useModelAndView")
    public ModelAndView passParamsWithModelAndView(String param1, int param2){
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("main");
       modelAndView.addObject("stringParam", param1);
       modelAndView.addObject("intParam", param2);
       return modelAndView;
    }
}
