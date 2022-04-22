package org.maxwell.beananno.entity;


public class Account {

  private Long id;
  private String name;
  private Double money;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  @Override
  public String toString() {
    return "Account{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", money=" + money +
            '}';
  }
}
