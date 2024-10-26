package Task_1;

public class Cat extends Animal{
    private static int catCount = 0;
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

    public static int getCatCount() {
        return catCount;
    }
}
