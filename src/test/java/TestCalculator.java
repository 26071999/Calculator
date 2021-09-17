import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void test(){
        Calculator c=new Calculator();
        Assert.assertEquals(12,c.add(10,2));
    }
}
