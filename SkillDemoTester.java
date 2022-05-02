import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    
    @Test
    public void factorialTest() {
        assertEquals(120, PracticeFile.factorial(4)); // Fails initially
    }
}