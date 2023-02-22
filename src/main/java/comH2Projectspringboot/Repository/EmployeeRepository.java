package comH2Projectspringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comH2Projectspringboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

}
