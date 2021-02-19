package lesson_20;

import org.junit.Before;
import org.junit.Test;

public class MainExTest {
    private Main main;

    @Before
    public void startTest() {
        main = new Main();
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        Main.AfterLast4(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }
}
