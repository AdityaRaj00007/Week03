package stringbuilderandbuffertesting;

import com.tit.stringbuilderandbuffer.reversestring.ReverseString;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTesting {
    // Since reverse method is static so we can directly call it here with class name
    @Test
    void testReverseString1(){
        String input = "aditya";
        String result = ReverseString.reverse(input);
        assertEquals("aytida" , result);
    }
    @Test
    void testReverseString2(){
        String input = "ankit";
        String result = ReverseString.reverse(input);
        assertEquals("tikna" , result);
    }
    @Test
    void testReverseString3(){
        String input = "aadarsh";
        String result = ReverseString.reverse(input);
        assertEquals("hsradaa" , result);
    }
}
