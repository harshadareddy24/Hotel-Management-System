package com;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class EmployeeService {
	
	 @Autowired
 private EmployeeRepository eRepo;
 
	 public List<Employee> listAll() {
	        return eRepo.findAll();
	    }
	     
	    public void save(Employee employee) {
	        eRepo.save(employee);
	    }
	     
	    public Employee get(long id) {
	        return eRepo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        eRepo.deleteById(id);
	    }
}
