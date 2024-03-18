package travel.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import travel.agency.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
