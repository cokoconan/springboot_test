package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.domain.User;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView Home(){
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping(value="/gett", method=RequestMethod.GET)
	public ModelAndView goIndex( @RequestParam("gname") String gname,@RequestParam("gemail") String gemail){
		ModelAndView mav = new ModelAndView("getindex");
		mav.addObject("gname",gname);
		mav.addObject("gemail",gemail);
		
		return mav;
	}
	
	@RequestMapping(value="/pst", method=RequestMethod.POST)
	public ModelAndView gopIndex(@ModelAttribute("usr") User usr){
		ModelAndView mav = new ModelAndView("postindex");
		return mav;
	}


}
