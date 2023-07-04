import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TannoTest {

    @Test
    void getValue() {
        Tanno t = new Tanno();
        assertEquals(2, t.getValue());
    }
}