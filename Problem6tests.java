import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Problem6tests {
    @Test
    public void test1() {
        String s[]={"Sunshine", "Umbrella", "Major", "Resourceful"};
        String expected = "Resourceful";
        assertEquals(expected, Problem6.max_vowels(s));
    }

    @Test
    public void test2() {
        String s[]={"Red", "Blue", "Yellow", "Green","orange"};
        String expected = "orange";
        assertEquals(expected, Problem6.max_vowels(s));
    }

    @Test
    public void test3() {
        String s[]={"Ajay", "Saathvik", "Abeer", "Kaber"};
        String expected = "Saathvik";
        assertEquals(expected, Problem6.max_vowels(s));
    }
}
