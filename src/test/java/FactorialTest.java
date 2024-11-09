import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class FactorialTest {
    @Test
    public void correctFactorialZero(){ // Тест для успешного подсчёта факториала нуля
        Factorial factorial = new Factorial();
        int number = factorial.calculateFactorial(0);
        Assert.assertEquals(1, number);
    }

    @Test
    public void correctFactorialDefault(){ // Тест для успешного подсчёта факториала обычного числа
        Factorial factorial = new Factorial();
        int number = factorial.calculateFactorial(5);
        Assert.assertEquals(120, number);
    }

    @Test
    public void incorrectFactorial(){ // Тест для неуспешной проверки
        Factorial factorial = new Factorial();
        int number = factorial.calculateFactorial(-8);
        Assert.assertEquals(-8, number);
    }
}
