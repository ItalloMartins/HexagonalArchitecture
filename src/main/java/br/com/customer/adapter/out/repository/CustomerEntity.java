package br.com.customer.adapter.out.repository;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

@MongoEntity(collection = "customer")
public class CustomerEntity extends PanacheMongoEntity {

  private ObjectId id;
  private String name;
  private Integer age;
  private String documentId;

  public CustomerEntity(Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.age = builder.age;
    this.documentId = builder.documentId;
  }

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public CustomerEntity(){
  }

  public CustomerEntity(ObjectId id, String name, Integer age, String documentId) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.documentId = documentId;
  }


  public static class Builder{
    private ObjectId id;
    private String name;
    private Integer age;
    private String documentId;

    public CustomerEntity.Builder withId(ObjectId id){
      this.id = id;
      return this;
    }

    public CustomerEntity.Builder withName(String name){
      this.name = name;
      return this;
    }

    public CustomerEntity.Builder withAge(Integer age){
      this.age = age;
      return this;
    }
    public CustomerEntity.Builder withDocumentId(String documentId){
      this.documentId = documentId;
      return this;
    }

    public CustomerEntity build() {
      return new CustomerEntity(this);
    }
  }

}
