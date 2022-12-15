package info.inetsolv.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import info.inetsolv.entity.Employee;
import info.inetsolv.service.EmployeeService;

@Controller
public class FormDataAccessController extends AbstractController {

	@Autowired
	@Qualifier("employeeService")
	EmployeeService employeeService;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Integer eno = Integer.parseInt(request.getParameter("eno"));
		String name = request.getParameter("eno");
		Double salary = Double.parseDouble(request.getParameter("eno"));
		
		Employee employee = new Employee();
		employee.setEno(eno);
		employee.setName(name);
		employee.setSalary(salary);
				
		return null;
	}
	
	@RequestMapping(path ="/data",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("employee") Employee employee) {
		
		employeeService.saveEmpData(employee);
		return null;
		
	}

}
