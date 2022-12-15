package info.inetsolv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import info.inetsolv.dao.EmployeeDAO;
import info.inetsolv.entity.Employee;

@Service("employeeService")
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Bean
	public void saveEmpData(Employee employee) {
		employeeDAO.saveData(employee);
	}
}
