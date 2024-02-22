import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Problem8tests {
    @Test
    public void test1() {
        int seconds=21893872;
        String expected = "253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)";
        assertEquals(expected, Problem8.seconds_conversion(seconds));
    }

    @Test
    public void test2() {
        int seconds=1000000;
        String expected = "11 Day(s) 13 Hour(s) 46 Minute(s) 40 Second(s)";
        assertEquals(expected, Problem8.seconds_conversion(seconds));
    }

    @Test
    public void test3() {
        int seconds=800000;
        String expected = "9 Day(s) 6 Hour(s) 13 Minute(s) 20 Second(s)";
        assertEquals(expected, Problem8.seconds_conversion(seconds));
    }

    @Test
    public void test4() {
        int seconds=837800;
        String expected = "9 Day(s) 16 Hour(s) 43 Minute(s) 20 Second(s)";
        assertEquals(expected, Problem8.seconds_conversion(seconds));
    }

}
