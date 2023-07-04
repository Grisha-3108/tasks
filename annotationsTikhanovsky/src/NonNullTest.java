import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonNullTest {

    @Test
    void a() {
        NonNull n = new NonNull();
        assertEquals(1, n.a(1));
    }
}