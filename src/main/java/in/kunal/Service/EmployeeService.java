package in.kunal.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kunal.Entity.Address;
import in.kunal.Entity.Employee;
import in.kunal.Repo.AddressRepo;
import in.kunal.Repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo emprepo;
	
	@Autowired
	private AddressRepo adrepo;
	
	public void saveemp() {
		Employee employee = new Employee();
		employee.setEmpName("Kunal Prajapat");
		employee.setEmpSalary(80000.0);
		
		
		Address a1 = new Address();
		a1.setCountry("India");
		a1.setCity("Khargone");
		a1.setState("Madhya Pradesh");
		
		Address a2 = new Address();
		a2.setCountry("India");
		a2.setCity("Khargone");
		a2.setState("Madhya Pradesh");
		
		List<Address> addlist = Arrays.asList(a1,a2);
		
//		association mapping with two entities
		
		a1.setEmployee(employee);
		employee.setAddress(addlist);
		
//		save employee and address to database
		emprepo.save(employee);
		
	}
	
	public void deleteaddress(Integer id) {
		adrepo.deleteById(id);
	}
	
	
	public void deleteemp(Integer id) {
		emprepo.deleteById(id);
	}

}
