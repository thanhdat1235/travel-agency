package travel.agency.mapper;

import travel.agency.dto.CustomerDTO;
import travel.agency.model.Customer;

public class CustomerMapper {
    public static CustomerDTO toCustomerDTO(Customer customer) {
      CustomerDTO tmp = new CustomerDTO();
      tmp.setId(customer.getId());
      tmp.setPhone(customer.getPhone());
      tmp.setEmail(customer.getEmail());
      tmp.setAddress(customer.getAddress());
      tmp.setFullName(customer.getFullName());
      tmp.setAvatarUrl(customer.getAvatarUrl());

      return tmp;
    }
}
