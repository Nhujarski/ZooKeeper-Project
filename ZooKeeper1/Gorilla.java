
public class Gorilla extends Mammal {
    public void throwSomething(){
        energyLevel -= 5;
        System.out.println("Oh Shit,The Gorilla threw something!");
    }
    public void eatBananas(){
        energyLevel += 10;
        System.out.println("Gorilla ate and is now happy.");
    }
    public void climb(){
        energyLevel -= 10;
        System.out.println("Look, The gorllia climbed a tree!");
    }
}