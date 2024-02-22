import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Problem3tests {
    @Test
    public void test1_both_positive() {
        int a=212;
        int b=421;
        int expected=421;
        assertEquals(expected, Problem3.greater(a, b));
    }

    @Test
    public void test2_neagative_and_positive() {
        int a=-1241;
        int b=1431;
        int expected=1431;
        assertEquals(expected, Problem3.greater(a, b));
    }

    @Test
    public void test3_both_negative() {
        int a=-1341;
        int b=-321;
        int expected=-321;
        assertEquals(expected, Problem3.greater(a, b));
    }
}
