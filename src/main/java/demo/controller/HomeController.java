package demo.controller;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.jpa.criteria.CriteriaBuilderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.domain.User;
import demo.repo.JpaUserRepository;

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
	
	
	@Autowired
	private JpaUserRepository repo;
	
	@RequestMapping(value="/jpalist")
	public ModelAndView jpaIndex(){
		ModelAndView mav = new ModelAndView("jpaindex");
		List<User> usrlist = this.repo.findAll();
		mav.addObject("usr",usrlist);
		return mav;
	}
	
	/*
	@RequestMapping(value="/jpalist", method=RequestMethod.GET)
	public ModelAndView jpaFindIndex( @RequestParam("name") String name, Model model){
		ModelAndView mav = new ModelAndView("jpaindex");
		List<User> usrlist = this.repo.findByNameLike(name);
		mav.addObject("usr",usrlist);
		return mav;
	}
	*/
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginPage(){
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	
	
	@RequestMapping(value="/reg", method=RequestMethod.POST)
	public ModelAndView Registration(@ModelAttribute("reg") User usr){
		ModelAndView mav = new ModelAndView("welcome");
		User rs = this.repo.save(usr);
		if(rs == null){
			mav.addObject("result","fail");
		}else{
			mav.addObject("user",rs);
			mav.addObject("result","good");
		}
		return mav;
	}
	
	
	
	// Criteria 연습해보기.
	@RequestMapping(value="/cri", method=RequestMethod.POST)
	public ModelAndView CriteriaTest(){
		ModelAndView mav = new ModelAndView("cri");
		
		EntityManagerFactory em =
			      Persistence.createEntityManagerFactory("application.properties");
		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaQuery<User> q =  cb.createQuery(User.class);
		//Root<User> c = q.from(User.class);
		//q.select(c.get("name"), cb.count(c.get("name")));
		return mav;
	}
	
	

}
