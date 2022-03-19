import com.company.Main;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class test1 {
    @Test
    public void test1() {
        assertTrue(Main.watermelon(6) == true);
    }
    @Test
    public void test2() {
        assertTrue(Main.watermelon(2) ==false);
    }
    @Test
    public void test3() {
        assertTrue(Main.watermelon(11) == false);
    }
}
