
public class Bat extends Mammal {
    public int energyLevel = 300;

    public void fly() {
        energyLevel -= 50;
        System.out.print("Woosh! *bat flew away*");
    }
    public void eatHumans() {
        energyLevel += 25;
        
    }
    public void attackTown(){
        energyLevel -= 100;
        System.out.println("*town is on fire. people scream in the distance.blood is everywhere.*");

    }
}