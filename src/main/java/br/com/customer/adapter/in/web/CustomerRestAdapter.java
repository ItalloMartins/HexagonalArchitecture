package br.com.customer.adapter.in.web;

import br.com.customer.adapter.out.repository.CustomerEntity;
import br.com.customer.application.port.in.CustomerUseCase;
import br.com.customer.domain.Customer;
import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.bson.types.ObjectId;

@Path("/customer")
public class CustomerRestAdapter {
  @Inject CustomerUseCase customerUseCase;

  @GET
  @Path("/findById")
  @Produces(MediaType.APPLICATION_JSON)
  public CustomerEntity findById(String id){
    return this.customerUseCase.findById(id);
  }

  @DELETE
  @Path("/delete")
  public void delete(String id){
    this.customerUseCase.delete(id);
  }

  @POST
  @Path("/save")
  public Customer save(@QueryParam("name") String name, @QueryParam("age") Integer age, @QueryParam("documentId") String doc){
    return this.customerUseCase.save(new Customer.Builder()
        .withId(new ObjectId())
        .withName(name)
        .withAge(age)
        .withDocumentId(doc).build()
    );
  }

  @PUT
  @Path("/update")
  public CustomerEntity updateCustomer(@QueryParam("id") String id, CustomerEntity customer) {
    return this.customerUseCase.updateCustomer(id, customer);
  }

}
