import java.util.*;

public class Zookeeper {
    //instance variables
    public String name;

    //constructor
    public Zookeeper(String name){
        this.name = name;
    }

    //methods
    public void feedAnimals(ArrayList<Animal> animals, String food){
        System.out.println(name + " is feeding " + food + " to " + animals.size() + " animals of " + Animal.population + " total" +
                " animals");
        for (int i = 0; i < animals.size(); i++){
            animals.get(i).eat(food);
        }
    }
}

