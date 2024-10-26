package Task_1;

public class Animal {
    private static int animalCount = 0;// Подсчёт животных
    private String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance){
        if(distance <= 0){
            System.out.println("Длинна препятствия не может быть 0 или -");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }
    public void swim(int distance){
        if(distance <= 0){
            System.out.println("Длинна препятствия не может быть 0 или -");
        } else {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }
}
