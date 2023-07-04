import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Protected2Test {

    @Test
    void getAnno() {
        Protected2 t = new Protected2();
        assertEquals(1, t.getAnno()[0].time());
        assertEquals("Des 1", t.getAnno()[0].description());
    }
}