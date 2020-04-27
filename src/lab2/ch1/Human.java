package lab2.ch1;

public class Human {
    private int health;
    private String name;
    public Human(int h,String n){
        this.health=h;
        this.name=n;
    }
    public int getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }
    public void decreaseHealth(int damage){
        health=health-damage;
    }
}
