import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class CheckForE implements StringChecker {
    public boolean checkString(String s) {
        if (s.contains("e")) {
            return true;
        } else {
            return false;
        }
    }
}

public class ListTests {
    @Test
    public void testFilter1() {
        List<String> input = new ArrayList<>();
        StringChecker sc = new CheckForE();
        input.add("hi");
        input.add("hello");
        input.add("hey");
        List<String> expected = new ArrayList<>();
        expected.add("hello");
        expected.add("hey");
        assertEquals(expected, ListExamples.filter(input, sc));
    }

    @Test
    public void testFilter2() {
        List<String> input = new ArrayList<>();
        StringChecker sc = new CheckForE();
        input.add("hi");
        input.add("hello");
        List<String> expected = new ArrayList<>();
        expected.add("hello");
        assertEquals(expected, ListExamples.filter(input, sc));
    }
}
