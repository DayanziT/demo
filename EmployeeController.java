package com.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	String displayLoginPage(){
		return "login";
	}

	@PostMapping("login")
	String authenticate(@RequestParam String email, @RequestParam String pswd, Model model) {
		System.out.println(email+" "+pswd);

		EmployeeDTO employeeDTO= employeeService.authenticate(email, pswd);
		
		System.out.println("ControllerLayer: " +employeeDTO);

		if (employeeDTO !=null) {
			model.addAttribute("validUser",employeeDTO);
			return "congrats";
		}else {
			model.addAttribute("invalidUser","Incorrect username or password. Please login again!");
			return "login";
		}
	}
	
	
	@GetMapping("showAllEmployees")
	String showAllEmployees(Model model) {
		List<EmployeeDTO> listEmployeeDTO=employeeService.showAllEmployees();
		model.addAttribute("listEmployeeDTO",listEmployeeDTO);
		return "showAllEmployees"; // showlALLEmployees.jsp 
	}
	
	@GetMapping("deleteEmployee")
	String delEmployee(@RequestParam int employeeId,Model model){
		
		employeeService.deleteEmployee(employeeId);
		
		List<EmployeeDTO> listEmplyeeDTO=employeeService.showAllEmployees();
		model.addAttribute("listEmployeeDTO", listEmplyeeDTO);		
		return "showAllEmployees";
	}
	
	@GetMapping ("registrationPage")
		String getRegistrationPage() {
			return "registration";
		}
	
	@PostMapping("register")
	String registerEmployee(@ModelAttribute EmployeeDTO employeeDTO) {		
		employeeService.saveEmployee(employeeDTO);
		return "login";
	}
	
	
	@GetMapping("homePage")
	String getHomePage() {
				return "login";
	}
	
	@GetMapping("updateEmployee")
	String displayUpdateEmployeePage(@RequestParam int employeeid, Model model) {
		System.out.println(employeeid);
		EmployeeDTO employeeDTO=employeeService.findById(employeeid);
		model.addAttribute("employeeDTO",employeeDTO);
		return "updateEmployee";
	}

	@PostMapping("updateEmployee")
	String displayUpdatedShowAllEmployees(@ModelAttribute EmployeeDTO employeeDTO, Model model) {
		employeeService.updateEmployee(employeeDTO);
		
		List<EmployeeDTO> listEmplyeeDTO=employeeService.showAllEmployees();
		model.addAttribute("listEmployeeDTO", listEmplyeeDTO);		
		
		return "showAllEmployees";
	}
}
	
	


