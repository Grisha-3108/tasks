import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekTest {

    @Test
    void printDay() {
        Week t = new Week();
        assertEquals(2, t.printDay());
    }
}