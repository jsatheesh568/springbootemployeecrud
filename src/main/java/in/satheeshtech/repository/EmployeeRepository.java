package in.satheeshtech.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import in.satheeshtech.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
