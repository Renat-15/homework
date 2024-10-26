package Task_1;

public class Dog extends Animal{
    private static int dogCount = 0; // Подсчёт собак
    public Dog(String name){
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if(distance > 500){
            System.out.println("Собака не может бежать дальше 500 метров");
        } else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        if(distance > 10){
            System.out.println("Собака не может проплыть больше 10 метров");
        }else {
            super.swim(distance);
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
