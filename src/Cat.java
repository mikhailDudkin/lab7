public class Cat extends Animal{
    private String color;
    public Cat(String color, boolean vegetarian, String eats, int noOfLegs){
        this.color=color;
        setVegetarian(vegetarian);
        setEats(eats);
        setNoOfLegs(noOfLegs);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
