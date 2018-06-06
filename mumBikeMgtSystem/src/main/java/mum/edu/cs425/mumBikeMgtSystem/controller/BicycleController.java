	package mum.edu.cs425.mumBikeMgtSystem.controller;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

	import mum.edu.cs425.mumBikeMgtSystem.model.Bicycle;
	import mum.edu.cs425.mumBikeMgtSystem.service.BicycleService;
	
	@Controller
	@RequestMapping(value="/bicycle")
	public class BicycleController {
		@Autowired
		private BicycleService bicycleService;
		
		 @RequestMapping(value="/list", method=RequestMethod.GET)
		 public ModelAndView list() {
		  ModelAndView model = new ModelAndView("bicycle_list");
		  List<Bicycle> bicycleList = bicycleService.getAllBicycles();
		  model.addObject("bicycleList", bicycleList);	  
		  return model;
		 }
		 
		 @RequestMapping(value="/addBicycle/", method=RequestMethod.GET)
		 public ModelAndView addBicycle() {
		  ModelAndView model = new ModelAndView();
		  Bicycle bicycle=new Bicycle();
		  model.addObject("bicycleForm", bicycle);
		  model.setViewName("bicycle_form");
		  
		  return model;
		 }

		 @RequestMapping(value="/updateBicycle/{id}", method=RequestMethod.GET)
		 public ModelAndView editBicycle(@PathVariable long id) {
		  ModelAndView model = new ModelAndView();
		  
		  Bicycle bicycle = bicycleService.getBicycleById(id);
		  model.addObject("bicycleForm", bicycle);
		  model.setViewName("bicycle_form");
		  
		  return model;
		 }
		 
		 @RequestMapping(value="/saveBicycle", method=RequestMethod.POST)
		 public ModelAndView save(@ModelAttribute("bicycleForm") Bicycle bicycle) {
		  bicycleService.saveOrUpdate(bicycle);
		  
		  return new ModelAndView("redirect:/bicycle/list");
		 }
		 
		  @RequestMapping(value="/deleteBicycle/{id}", method=RequestMethod.GET)
		 public ModelAndView delete(@PathVariable long id) {
		  bicycleService.deleteBicycle(id);
		  
		  return new ModelAndView("redirect:/bicycle/list");
		 }
		 
	}
