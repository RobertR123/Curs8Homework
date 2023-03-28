public class Electronics extends Product{
    public String type;

    public void setType(String type) {
        this.type = type;
    }

    public int length;
    public int width;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int height;
    public int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void electronic(){
        System.out.println(this.weight);
    }
    public Electronics(){
        this.setName("Laptop Asus");
        this.setPrice(3999);
        this.setQuantity(15);
        this.setDescription("Laptop Gaming Asus");
        this.setWeight(2430);
        this.setLength(13);
        this.setWidth(12);

    }
}
