import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class AppTest {
    @Test
    @DisplayName("test")
    void myfirstTest(TestInfo testinfo){
        assertEquals(1, 1);
    }
}
