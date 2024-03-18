package travel.agency.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import travel.agency.dto.CustomerDTO;
import travel.agency.mapper.CustomerMapper;
import travel.agency.model.Customer;
import travel.agency.repository.CustomerRepository;

@Component
public class CustomerServiceImpl implements CustomerService {

  private static ArrayList<Customer> customers = new ArrayList<Customer>();

  @Autowired
  CustomerRepository customerRepository;

  static {
    customers.add(new Customer(1, "Nguyễn Thành Đạt",
        "60B Thích Bửu Đăng - Phường 1 - Gò Vấp - Thành Phố Hồ Chí Minh",
        "https://scontent.fsgn2-11.fna.fbcdn.net/v/t39.30808-6/336730385_181512794627675_1953809780091189104_n.jpg?stp=c0.23.206.206a_dst-jpg_p206x206&_nc_cat=105&ccb=1-7&_nc_sid=5f2048&_nc_ohc=ab7XuAnX9zcAX-XQFkE&_nc_ht=scontent.fsgn2-11.fna&oh=00_AfDtX2dmx_KjnalZCtaZP18rUI-gtw5unokZzyQYtQMpCA&oe=65FD4CEB",
        "0357457225", "thanhdat232k@gmail.com", "1235"));
    customers.add(new Customer(2, "Nguyễn Duy Thuận",
        "60B Thích Bửu Đăng - Phường 1 - Gò Vấp - Thành Phố Hồ Chí Minh",
        "https://scontent.fsgn2-7.fna.fbcdn.net/v/t39.30808-6/333864185_1248810302389150_5344640539762928295_n.jpg?stp=c0.23.206.206a_dst-jpg_p206x206&_nc_cat=108&ccb=1-7&_nc_sid=5f2048&_nc_ohc=mFo37PwdDp4AX-6CFHJ&_nc_ht=scontent.fsgn2-7.fna&oh=00_AfDCW1Xu_5lNE4Gj4HpQvOsxleqISncScUHialCGvOeNXw&oe=65FCF9D8",
        "03574572235", "thanhdat231012k@gmail.com", "1235"));
    customers.add(new Customer(2, "Nguyễn Văn Hoàng",
        "60B Thích Bửu Đăng - Phường 1 - Gò Vấp - Thành Phố Hồ Chí Minh",
        "https://scontent.fsgn2-7.fna.fbcdn.net/v/t39.30808-6/333864185_1248810302389150_5344640539762928295_n.jpg?stp=c0.23.206.206a_dst-jpg_p206x206&_nc_cat=108&ccb=1-7&_nc_sid=5f2048&_nc_ohc=mFo37PwdDp4AX-6CFHJ&_nc_ht=scontent.fsgn2-7.fna&oh=00_AfDCW1Xu_5lNE4Gj4HpQvOsxleqISncScUHialCGvOeNXw&oe=65FCF9D8",
        "03574572235", "thanhdat232k@gmail.com", "1235"));
  }

  @Override
  public List<CustomerDTO> getListCustomer() {int CustomerDTO;
    List<CustomerDTO> result = new ArrayList<CustomerDTO>();
    for (Customer customer : customers) {
      result.add(CustomerMapper.toCustomerDTO(customer));
    }
    return result;
  }

  @Override
  public CustomerDTO createCustomer(Customer customer) {
    Customer savedCustomer = customerRepository.save(customer);
    CustomerDTO customerDTO = CustomerMapper.toCustomerDTO(savedCustomer);
    return  customerDTO;
  }
}
