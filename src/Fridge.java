public class Fridge extends Electronics{
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void temperature(){
        System.out.println(this.temperature);
    }
    public int temperature;

    public Fridge(){
        this.setName("Arctic");
        this.setPrice(5600);
        this.setQuantity(11);
        this.setDescription("Arctic Fridge");
        this.setWeight(100000);
        this.setLength(50);
        this.setWidth(30);
        this.setHeight(250);
        this.setTemperature(5);

    }

}
