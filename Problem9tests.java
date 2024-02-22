import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Problem9tests {
    @Test
    public void test1() {
        int n=59;
        String expected = "Is a special integer";
        assertEquals(expected, Problem9.is_special(n));
    }

    @Test
    public void test7() {
        int n=69;
        String expected = "Is a special integer";
        assertEquals(expected, Problem9.is_special(n));
    }

    @Test
    public void test3() {
        int n=92;
        String expected = "Is not a special integer";
        assertEquals(expected, Problem9.is_special(n));
    }

    @Test
    public void test4() {
        int n=9;
        String expected = "Is not a special integer";
        assertEquals(expected, Problem9.is_special(n));
    }
}
