package br.com.customer.adapter.out.repository;

import br.com.customer.application.port.out.CustomerPort;
import br.com.customer.domain.Customer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

@ApplicationScoped
public class CustomerAdapter implements CustomerPort {

  @Inject
  CustomerRepository customerRepository;

  @Override
  public Customer save(Customer customer) {
    this.customerRepository.save(new CustomerEntity.Builder()
        .withName(customer.getName())
        .withAge(customer.getAge())
        .withDocumentId(customer.getDocumentId())
        .build()
    );
    return customer;
  }

  @Override
  public boolean delete(String id) {
    return this.customerRepository.delete(id);
  }

  @Override
  public List<CustomerEntity> getCustomers() {
    return customerRepository.getCustomers();
  }

  @Override
  public CustomerEntity findById(String id) {
  return customerRepository.findById(id);
  }

  @Override
  public CustomerEntity updateCustomer(String id, CustomerEntity customer) {
    return customerRepository.updateCustomer(id, customer);
  }
}
