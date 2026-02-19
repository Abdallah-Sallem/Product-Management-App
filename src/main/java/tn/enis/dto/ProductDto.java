package tn.enis.dto;

public class ProductDto {

    private String name;
    private int quantity;
    private float price;
    private float total;

    public ProductDto() {}

    public ProductDto(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = quantity * price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.total = quantity * price;
    }

    public float getPrice() { return price; }
    public void setPrice(float price) {
        this.price = price;
        this.total = quantity * price;
    }

    public float getTotal() { return total; }
}
