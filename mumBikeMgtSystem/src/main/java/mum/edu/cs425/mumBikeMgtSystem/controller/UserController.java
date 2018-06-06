package mum.edu.cs425.mumBikeMgtSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.cs425.mumBikeMgtSystem.model.User;
import mum.edu.cs425.mumBikeMgtSystem.service.UserService;
@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("user_list");
	  List<User> userList = userService.getAllUsers();
	  model.addObject("userList", userList);	  
	  return model;
	 }
	 
	 @RequestMapping(value="/addUser/", method=RequestMethod.GET)
	 public ModelAndView addUser() {
	  ModelAndView model = new ModelAndView();
	  User user=new User();
	  model.addObject("userForm", user);
	  model.setViewName("user_form");
	  
	  return model;
	 }

	 @RequestMapping(value="/updateUser/{id}", method=RequestMethod.GET)
	 public ModelAndView editUser(@PathVariable long id) {
	  ModelAndView model = new ModelAndView();
	  
	  User user = userService.getUserById(id);
	  model.addObject("userForm", user);
	  model.setViewName("user_form");
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/saveUser", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("userForm") User user) {
	  userService.saveOrUpdate(user);
	  
	  return new ModelAndView("redirect:/user/list");
	 }
	 
	  @RequestMapping(value="/deleteUser/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable long id) {
	  userService.deleteUser(id);
	  
	  return new ModelAndView("redirect:/user/list");
	 }
	 
}
