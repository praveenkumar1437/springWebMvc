package info.inetsolv.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import info.inetsolv.entity.Employee;

@Repository
public class EmployeeDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveData(Employee employee) {
		
		entityManager.persist(employee);
	}
}
