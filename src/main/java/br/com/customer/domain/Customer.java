package br.com.customer.domain;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import java.util.List;
import java.util.UUID;
import org.bson.types.ObjectId;

public class Customer {

  private ObjectId id;
  private String name;
  private Integer age;
  private String documentId;

  public Customer(ObjectId id, String name, Integer age, String documentId) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.documentId = documentId;
  }

  public Customer(Builder builder) {
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

  public static class Builder{

    private ObjectId id;
    private String name;
    private Integer age;
    private String documentId;

    public Builder withId(ObjectId id){
      this.id = id;
      return this;
    }

    public Builder withName(String name){
      this.name = name;
      return this;
    }

    public Builder withAge(Integer age){
      this.age = age;
      return this;
    }
    public Builder withDocumentId(String documentId){
      this.documentId = documentId;
      return this;
    }

    public Customer build() {
      return new Customer(this);
    }
  }
}
