public class Cosmetics extends Product{
    public String color;
    public double weight;

    public void setColor(String color){
        this.color = color;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void cosmetic(){
        System.out.println(this.color);
    }
    public Cosmetics(){
        this.setName("Eyeliner");
        this.setPrice(18);
        this.setQuantity(30);
        this.setDescription("make up eyeliner");
        this.setColor("Black");
        this.setWeight(10);

    }

}
