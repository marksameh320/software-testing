import com.company.Main;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test_force {
    @Test
    public void test0(){
        assertTrue(Main.equal(0,0,0)==true);
    }
    @Test
    public void test1(){
        assertTrue(Main.equal(0,3,0)==false);
    }
    @Test
    public void test2(){
        assertTrue(Main.equal(0,0,3)==false);
    }
    @Test
    public void test3(){
        assertTrue(Main.equal(-3,0,3)==false);
    }
    public void test4(){
        assertTrue(Main.equal(3,0,0)==false);

    }
    @Test
    public void test5(){
        assertTrue(Main.equal(-4,3,0)==false);
    }
    @Test
    public void test6() {
        assertTrue(Main.equal(4, 0, -3) == false);
    }
}

