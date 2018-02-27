public class Animal {

    //instance variables
    public String name;
    public String favoriteFood;
    static int population = 0;
    //constructors
    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population ++;
    }

    //methods
    public void sleep(String name) {
            System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        if(food.equals(favoriteFood)){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println(name + " eats " + food);
            System.out.println(name + " sleeps for 8 hours");
        }
    }

    public void populationCount(){
        System.out.println(population);
    }

}
