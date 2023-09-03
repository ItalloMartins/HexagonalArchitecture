package br.com.customer.adapter.out.repository;

import br.com.customer.domain.Customer;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import org.bson.types.ObjectId;

@ApplicationScoped
public class CustomerRepository extends PanacheMongoEntity {

  public void save(CustomerEntity build) {
    build.persistOrUpdate();
  }

  public CustomerEntity findById(String id){
    return CustomerEntity.findById(new ObjectId(id));
  }
  public List<CustomerEntity> getCustomers() {
    return CustomerEntity.findAll().list();
  }

  public boolean delete(String id){
    return CustomerEntity.deleteById(new ObjectId(id));
  }

  public CustomerEntity updateCustomer(String id, CustomerEntity customer){
    customer.persistOrUpdate();
    return CustomerEntity.findById(new ObjectId(id));
  }
}
