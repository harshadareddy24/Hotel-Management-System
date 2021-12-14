package com;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
	 
	@Controller
	public class AdminController {
		
		
		@Autowired
	    private AdminRepository adminRepo;
	     
	    @GetMapping("")
	    public String viewHomePage() {
	        return "index";
	    }
	    
	    @GetMapping("/login2")
	    public String viewHomePage1() {
	        return "login2";
	    }
	    @GetMapping("/admin")
	    public String viewHomePage6() {
	        return "admin";
	}
	    @RequestMapping("/employee")
		public String showNewPage(Model model) {
		    Employee employee = new Employee();
		    model.addAttribute("employee", employee);
		     
		    return "employee";
		}
	   
	       @Autowired
	    private UserRepository userRepo;
		
	        
	   	 @GetMapping("/login")
		    public String viewHomePage3() {
		        return "login";
		}
		    @GetMapping("/new")
		    public String showRegistrationForm(Model model) {
		        model.addAttribute("user", new User());
		         
		        return "new";
		    }

		    @PostMapping("/register_success")
		    public String processRegister(User user) {
		       /* BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		        String encodedPassword = passwordEncoder.encode(user.getPassword());
		        user.setPassword(encodedPassword);*/
		         
		        userRepo.save(user);
		        return "register_success";
		    }
		    @GetMapping("/gservice")
		    public String viewHomePage7() {
		        return "gservice";
		    }
	
		    @Autowired
		    private EmployeeRepository eRepo;
			
		    @PostMapping("/admin")
		    public String processRegister(Employee employee){
		      /*  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		        String encodedPassword = passwordEncoder.encode(employee).getPassword());
		        employee).setPassword(encodedPassword);*/
		         
		        eRepo.save(employee);
		         
		        return "admin";}
		        
		     @GetMapping("/login1")
		    public String viewHomePage11() {
		        return "login1";
		    }
		     @GetMapping("/viewEmployee")
			    public String viewHomePage12() {
			        return "viewEmployee";
			    }
		
		    @Autowired
		    private EmployeeService service;
			
			@RequestMapping("/employeeList")
			public String viewHomePage(Model model) {
			    List<Employee> listEmployee = service.listAll();
			    model.addAttribute("listEmployee", listEmployee);
			     
			    return "employeeList";
			}
			
			@RequestMapping(value = "/save", method = RequestMethod.POST)
			public String saveEmployee(@ModelAttribute("employee") Employee employee) {
			    service.save(employee);
			     
			    return "redirect:/employeeList";
			}
			@RequestMapping("/edit/{id}")
			public ModelAndView showEditEmployeePage(@PathVariable(name = "id") long id) {
			    ModelAndView mav = new ModelAndView("editEmployee");
			    Employee employee = service.get(id);
			    mav.addObject("employee", employee);
			     
			    return mav; } 
			
			@RequestMapping("/delete/{id}")
			public String deleteEmployee(@PathVariable(name = "id") long id) {
			    service.delete(id);
			    return "redirect:/employeeList";       
			}	   	 
			@Autowired
		private BookingRepository bRepo;
			@PostMapping("/Book_Success")
		    public String processRegister(Booking Booking){
		       /* BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		        String encodedPassword = passwordEncoder.encode(employee).getPassword());
		        employee).setPassword(encodedPassword);*/
		         
		        bRepo.save(Booking);
		         
		        return "Book_Success";}
			
		
	@Autowired
    private UserService uservice;
	
	@RequestMapping("/guest")
	public String viewHomePage13(Model model) {
	    List<User> listUser = uservice.listAll();
	    model.addAttribute("listUser ", listUser );
	     
	    return "guest";
	}
	@Autowired
    private BookingService bservice;
	
	@RequestMapping("/gbook")
	public String viewHomePage14(Model model) {
	    List<Booking> listbooking = bservice.listAll();
	    model.addAttribute("listbooking ", listbooking );
	     
	    return "gbook";
	}
	}
	    