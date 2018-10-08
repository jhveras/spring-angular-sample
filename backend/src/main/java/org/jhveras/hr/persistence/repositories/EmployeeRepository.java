package org.jhveras.hr.persistence.repositories;

import java.sql.Date;
import java.util.List;
import org.jhveras.hr.persistence.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);

    List<Employee> findByEmployeeId(Long employeeId);

    List<Employee> findByEmail(String email);

    List<Employee> findByHireDate(Date hireDate);
}