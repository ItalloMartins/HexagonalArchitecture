package br.com.customer.application.port.in;

import br.com.customer.adapter.out.repository.CustomerEntity;
import br.com.customer.domain.Customer;
import java.util.List;
import org.bson.types.ObjectId;

public interface CustomerUseCase {

  Customer save(Customer customer);

  boolean delete(String id);

  List<CustomerEntity> getCustomers();

  List<CustomerEntity> getByName(String name);

  CustomerEntity findById(String id);

  CustomerEntity updateCustomer(String id, CustomerEntity customer);

}
