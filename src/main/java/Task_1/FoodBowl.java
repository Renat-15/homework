package Task_1;

public class FoodBowl {
    private int amountFood;

    public FoodBowl(int amountFood) {
        if(amountFood < 0){
            this.amountFood = 0; // Если переданное значение будет меньше нуля, в микску будет добавлено 0
        } else {
            this.amountFood = amountFood;
        }
    }

    public int getAmountFood() {
        return amountFood;
    }
    public void catEating(int amount){ // Метод уменьшения еды в миске, когда кот ест
        if(amount <= amountFood){
            amountFood-=amount;
        }else {
            amountFood = 0;
        }
    }
    public void addFood(int amount){ // Метод добавления еды в миску
        if(amount > 0){
            amountFood+=amount;
            System.out.println("Добавлено " + amount + " еды в миску");
        }
    }
}
