package in.kunal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kunal.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
