package Task_1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Ara");
        Animal cat = new Cat("Maga");
        dog.run(500);
        cat.swim(0);
        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
        System.out.println("Количесвто собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

    }
}


