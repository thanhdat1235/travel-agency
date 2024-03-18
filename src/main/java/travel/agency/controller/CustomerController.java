package travel.agency.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import travel.agency.dto.CustomerDTO;
import travel.agency.model.Customer;
import travel.agency.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public ResponseEntity<?> getListCustomer() {
        List<CustomerDTO> customers = customerService.getListCustomer();
        return ResponseEntity.ok(customers);
    }

    @PostMapping("")
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody Customer customer) {
        try {
           CustomerDTO savedCustomer = customerService.createCustomer(customer);

           return ResponseEntity.ok(savedCustomer);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
