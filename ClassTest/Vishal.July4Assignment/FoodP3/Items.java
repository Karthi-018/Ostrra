package FoodP3;


public class Items {
    private String name;
    private Double price;
    private String type;

    public Items() {}

   
    public Items(String name, Double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + ", type=" + type + "]";
    }
}
	
