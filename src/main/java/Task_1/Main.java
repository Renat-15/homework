package Task_1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Sharik");
        dog.run(500);
        dog.swim(5);

        Animal cat = new Cat("Bublik");
        cat.run(100);
        cat.swim(0);

        FoodBowl foodBowl = new FoodBowl(12);
        Cat[] cats = {new Cat("Кот1"), new Cat("Кот2"), new Cat("Кот3")};

        for(Cat cat1: cats){
            cat1.eat(foodBowl, 6);
        }

        foodBowl.addFood(18);

        for(Cat cat1: cats){
            cat1.eat(foodBowl, 6);
        }

        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
        System.out.println("Количесвто собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

    }
}


