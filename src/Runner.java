import java.util.*;
public class Runner {

   public static void main(String[] args) {

      Tiger tigger = new Tiger("Tigger");
      tigger.eat("meat");
      Bear pooh = new Bear("Pooh");
      pooh.eat("fish");
      pooh.eat("meat");
      Unicorn rarity = new Unicorn ("Rarity");
      rarity.eat("marshmallows");
      rarity.sleep("Rarity");
      Giraffe gemma = new Giraffe("Gemma");
      gemma.eat("meat");
      gemma.eat("leaves");
      gemma.sleep("Gemma");
      Bee stinger = new Bee ("Stinger");
      stinger.eat("ice cream");
      stinger.eat("pollen");
      stinger.sleep("Stinger");

      ArrayList<Animal> animals = new ArrayList<>();
      animals.add(tigger);
      animals.add(pooh);
      animals.add(gemma);
      animals.add(stinger);
      animals.add(rarity);
      Zookeeper zoebot = new Zookeeper("Zoebot");
      zoebot.feedAnimals(animals, "meat");

   }


}
