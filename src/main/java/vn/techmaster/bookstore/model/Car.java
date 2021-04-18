package vn.techmaster.bookstore.model;

public class Car {
  private int id;
  private String name;
  private String manufacture;
  private int price;
  private String photo;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getManufacture() {
    return manufacture;
  }

  public void setManufacture(String manufacture) {
    this.manufacture = manufacture;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getPhoto() {
    return photo;
  }

  public Car(int id, String name, String manufacture, int price, String photo) {
    this.id = id;
    this.name = name;
    this.manufacture = manufacture;
    this.price = price;
    this.photo = photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  //Tất cả những đoạn code phía dưới đều có thể tự sinh ra nhờ 
  // chức năng Source Actions -> generates Setter/Getter, constructor

 
  @Override
  public String toString() {
    return "Car [name=" + name + ", id=" + id + ", manufacture=" + manufacture + "]";
  }
}