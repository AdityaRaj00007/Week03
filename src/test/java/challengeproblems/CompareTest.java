package challengeproblems;
import com.tit.challengeproblems.stringandfilereader.Compare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class CompareTest {

    @Test
    public void testBuilderPerformance() {
        // Test that builderPerformance() returns a positive duration
        long builderTime = Compare.builderPerformance();
        assertTrue(builderTime > 0, "builderPerformance should return a positive time duration");
    }

    @Test
    public void testBufferPerformance() {
        // Test that bufferPerformance() returns a positive duration
        long bufferTime = Compare.bufferPerformance();
        assertTrue(bufferTime > 0, "bufferPerformance should return a positive time duration");
    }
}