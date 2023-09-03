package br.com.customer.application.service;

import br.com.customer.adapter.out.repository.CustomerEntity;
import br.com.customer.application.port.in.CustomerUseCase;
import br.com.customer.application.port.out.CustomerPort;
import br.com.customer.domain.Customer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import org.bson.types.ObjectId;

@ApplicationScoped
public class CustomerInput implements CustomerUseCase {
  @Inject
  CustomerPort customerPort;

  @Override
  public Customer save(Customer customer) {
    return this.customerPort.save(customer);
  }

  @Override
  public boolean delete(String id) {
//    this.customerPort.delete(id);
    return customerPort.delete(id);
  }

  @Override
  public List<CustomerEntity> getCustomers() {
    return this.customerPort.getCustomers();
  }

  @Override
  public List<CustomerEntity> getByName(String name) {
    return null;
  }

  @Override
  public CustomerEntity findById(String id) {
    return customerPort.findById(id);
  }

  @Override
  public CustomerEntity updateCustomer(String id, CustomerEntity customer) {
    return customerPort.updateCustomer(id, customer);
  }
}
