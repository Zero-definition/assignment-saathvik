import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Problem7tests 
{
    @Test
    public void test1() {
        double rate = 20;
        int years=5;
        int expected = 149;
        assertEquals(expected, Problem7.inflation(years,rate));
    }
    
    @Test
    public void test2() {
        double rate = 15;
        int years=3;
        int expected = 52;
        assertEquals(expected, Problem7.inflation(years,rate));
    }

    @Test
    public void test3() {
        double rate = 9;
        int years=4;
        int expected = 41;
        assertEquals(expected, Problem7.inflation(years,rate));
    }

    @Test
    public void test4() {
        double rate = 13;
        int years=8;
        int expected = 166;
        assertEquals(expected, Problem7.inflation(years,rate));
    }
}
