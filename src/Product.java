public class Product {
    public String name;
    public String description;
    public int quantity;
    public double price;
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void showPrice(){
        System.out.println(this.price);
    }

    public void showDescription(){
        System.out.println(this.description);
    }

    public void showQuantity(){
        System.out.println(this.quantity);
    }
    public void showName(){
        System.out.println(this.name);
    }
}
