package com.springboot.cruddemo.crudapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.springboot.cruddemo.crudapi.entity.Employee;

@Repository
public class EmployeeDAOHibernate implements EmployeeDAO {

	//define field for entitymanager
	private EntityManager entityManager;
	
	//setup constructor injection
	@Autowired
	public EmployeeDAOHibernate(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	@Override
	
	public List<Employee> findAll() {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//create query
		Query<Employee> theQuery = currentSession.createQuery("from Employee",Employee.class);
		//execute query and get result list
		List<Employee> employee = theQuery.getResultList(); 
		//return the result
		return employee;
	}
	@Override
	public Employee findById(int theId) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//get the employee
		Employee theEmployee = currentSession.get(Employee.class, theId);
		
		//return employee
		return theEmployee;
	}
	@Override
	public void save(Employee theEmployee) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//save Employee
		currentSession.saveOrUpdate(theEmployee);		
		
	}
	@Override
	public void deleteById(int theId) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		//delete Employee
		Query theQuery = currentSession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
		
	}

}
