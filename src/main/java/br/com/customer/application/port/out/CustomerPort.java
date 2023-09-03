package br.com.customer.application.port.out;

import br.com.customer.adapter.out.repository.CustomerEntity;
import br.com.customer.domain.Customer;
import java.util.List;
import org.bson.types.ObjectId;

public interface CustomerPort {
  Customer save(Customer customer);

  boolean delete(String id);

  List<CustomerEntity> getCustomers();

  CustomerEntity findById(String id);

  CustomerEntity updateCustomer(String id, CustomerEntity customer);
}
