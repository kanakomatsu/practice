public abstract class TangibleAsset {
  private int price;
  private String color;
  
  public tangibleAsset(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color;
  }
  public String getname() {
    return this.name;
  }
  public int getPrice() {
    return this.price;
  }
  public String getColor() {
    return this.color;
  }
}
