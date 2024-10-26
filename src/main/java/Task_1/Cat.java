package Task_1;

public class Cat extends Animal{
    private static int catCount = 0; // Подсчёт котов
    private boolean Hunger = false; // Состояние голода
    public Cat(String name){
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if(distance > 200){
            System.out.println("Кот не может бежать дальше 200 метров");
        } else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    public void eat(FoodBowl foodBowl, int amount){ // Метод чтобы кот поел
        if(foodBowl.getAmountFood() >= amount){ // Если изначальное количество в миске >= количества еды, которое нужно коту
            foodBowl.catEating(amount);         // То кот ест на своё количество
            Hunger = true;
            System.out.println("Кот поел и теперь он сыт");
        } else {
            System.out.println("Коту не хватило еды в миске :(");
        }
    }

    public static int getCatCount() {
        return catCount;
    }

}
