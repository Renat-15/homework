import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class FactorialTest {
    @Test
    public void correctFactorialZero(){
        Factorial factorial = new Factorial();
        int number = factorial.calculateFactorial(0);
        Assert.assertEquals(1, number);
    }

    @Test
    public void correctFactorialDefault(){
        Factorial factorial = new Factorial();
        int number = factorial.calculateFactorial(5);
        Assert.assertEquals(120, number);
    }

    @Test
    public void incorrectFactorial(){
        Factorial factorial = new Factorial();
        int number = factorial.calculateFactorial(-8);
        Assert.assertEquals(-8, number);
    }
}
