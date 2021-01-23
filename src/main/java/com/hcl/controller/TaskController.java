package com.hcl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.exception.FailedDatabaseActionException;
import com.hcl.model.Task;
import com.hcl.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService service;
	
	@GetMapping("/listtsk")
	public ModelAndView listTsk() {
		//List<Employee> allemps = (List<Employee>) repo.findAll();
		System.out.println("----------1)inside listTsk");
		List<Task> alltsks = (List<Task>) service.findAllTasks();
		System.out.println("----------2)inside listTsk");
		return new ModelAndView("tsks", "tasks", alltsks);
		
	}
	@GetMapping("/addtsk")
	public ModelAndView addnewTsk() {
		
		Task t1 = new Task();
		return new ModelAndView("newtsk", "form", t1);  //model attribure<form:form modelAttribute="form">
	}
	@PostMapping("/addtsk")
	public String newTsk(Task tsk) {
		//repo.save(emp);
		try {
			service.saveTask(tsk);
		} catch (FailedDatabaseActionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------BEFORE REDIRECTING----------");
		return ("redirect:/listtsk");
	}
	
	@GetMapping("/edittsk")
	public ModelAndView getEditTsk() {
		Task t1 = new Task();
		System.out.println("--------------INSIDE EDITPOST----------");
		return new ModelAndView("taskeditform", "form", t1);
	}
	@PostMapping("/edittsk")
	public ModelAndView postEditTsk(@ModelAttribute("Task") Task tsk) {
		

		try {
			Task t = service.findTaskById(tsk.getId()).get();
			long id = t.getId();
			return new ModelAndView("redirect:/editingtsk/" + id);
		} catch (Exception e) {
			return new ModelAndView("wrong");
			//throw new WrongInputException("wrong");
			
		}
	}
//	@GetMapping("/editingtsk")
//	public ModelAndView getEditingTsk(@RequestParam("id") long id)  {
//		System.out.println("toooooooooooooodaaaaaaaaaaaaaaaaaaaaaaaaaaaayyyyyyyyyyyyyyyyyyyyyy");
//		Optional<Task> tsk = service.findTaskById(id);
//		return new ModelAndView("taskediting", "edittsk", tsk);
//	}
//	
	
	
	@GetMapping("/editingtsk/{id}")
	public ModelAndView getEditingTsk(@PathVariable("id") long id)  {
		ModelAndView mav = new ModelAndView("taskediting");
		try {
			Task tsk = service.findTaskById(id).get();
			mav.addObject("edittsk", tsk);

		} catch (Exception e) {
			//throw new WrongInputException("wrong");
			return new ModelAndView("wrong");
		}
		return mav;
	}
	@PostMapping("/editingtsk/{id}")
	public ModelAndView postgetEditingTsk(@ModelAttribute("Task") Task tsk) {
		try {
			service.saveTask(tsk);
		} catch (FailedDatabaseActionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/listtsk");
	}
	/////////////////////
	/////////////////////
	@GetMapping("/deletetsk")
	public ModelAndView getDeleteTsk() {
		Task t1 = new Task();
		System.out.println("--------------INSIDE EDITPOST----------");
		return new ModelAndView("taskdeleteform", "form", t1);
	}
	@PostMapping("/deletetsk")
	public ModelAndView postDeleteTsk(@ModelAttribute("Task") Task tsk) {
		try {
			Task t = service.findTaskById(tsk.getId()).get();
			long id = t.getId();
			return new ModelAndView("redirect:/deletingtsk/" + id);
		} catch (Exception e) {
			return new ModelAndView("wrong");
		}
	}
	@GetMapping("/deletingtsk/{id}")
	public ModelAndView getDeletingTsk(@PathVariable("id") long id) {
		ModelAndView mav = new ModelAndView("taskdeleting");
		try {
			Task tsk = service.findTaskById(id).get();
			mav.addObject("dlttsk", tsk);

		} catch (Exception e) {
			return new ModelAndView("wrong");
		}
		return mav;
	}
	@PostMapping("/deletingtsk/{id}")
	public ModelAndView postgetDeletingTsk(@ModelAttribute("Task") Task tsk) {
		//service.saveTask(tsk);
		try {
			service.deleteTask(tsk);
		} catch (FailedDatabaseActionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/listtsk");
	}
	
	
	
}
