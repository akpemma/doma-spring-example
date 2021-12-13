package sample.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.dao.EmployeeDao;
import sample.entity.Employee;

@Service
public class EmployeeService {String queryStr = "select name, email, headline, phone_no from employee where lower(name) like ?";
try {
    Query query = entityManager.createNativeQuery(queryStr);
    query.setParameter(1, "%" + name.toLowerCase() + "%");

	@Inject
	protected EmployeeDao employeeDao;

	public Employee selectById(Integer employeeId) {
		return employeeDao.selectById(employeeId);
	}

	@Transactional
	public int update(Employee employee) {
		return employeeDao.update(employee);
	}

}
