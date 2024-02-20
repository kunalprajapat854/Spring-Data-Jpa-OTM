package in.kunal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kunal.Entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
