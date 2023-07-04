import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Anno2repTest {

    @Test
    void sum() {
        Anno2rep t = new Anno2rep();
        assertEquals(3, t.sum(1, 1));
    }
}