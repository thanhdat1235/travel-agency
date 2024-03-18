package travel.agency.service;

import java.util.List;
import org.springframework.stereotype.Service;
import travel.agency.dto.CustomerDTO;
import travel.agency.model.Customer;

@Service
public interface CustomerService {
  public List<CustomerDTO> getListCustomer();

  public  CustomerDTO createCustomer(Customer customer);
}
