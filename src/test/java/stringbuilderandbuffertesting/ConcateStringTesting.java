package stringbuilderandbuffertesting;

import com.tit.stringbuilderandbuffer.concatenatestrings.ConcateString;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcateStringTesting {
    static ConcateString cs;
   @BeforeAll
   static void setup(){
       cs = new ConcateString();
   }

   @Test
   void testConcateStringWithValidInput() {
       String[] inputArray = {"Hello", "JUnit", "Test"};
       String result = cs.concateString(inputArray);
       assertEquals("Hello JUnit Test ", result);
   }
    @Test
    void testConcateStringWithEmptyInput() {
        String[] inputArray = {};
        String result = cs.concateString(inputArray);
        assertEquals("", result, "Expected an empty string for an empty input array.");
    }

    @Test
    void testConcateStringWithSingleElement() {
        String[] inputArray = {"Hello"};
        String result = cs.concateString(inputArray);
        assertEquals("Hello ", result, "Expected a single word followed by a space.");
    }

}
