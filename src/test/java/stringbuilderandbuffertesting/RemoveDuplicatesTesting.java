package stringbuilderandbuffertesting;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.tit.stringbuilderandbuffer.removeduplicates.RemoveDuplicates;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTesting {
    @Test
    void testRemoveDuplicates1(){
        String input = "aaabbbccdde";
        String result = RemoveDuplicates.removeDuplicates(input);
        assertEquals("abcde" , result );
    }
    @Test
    void testRemoveDuplicatesWithEmptyString() {
        String input = "";
        String result = RemoveDuplicates.removeDuplicates(input);
        assertEquals("", result, "Expected an empty string when the input is empty.");
    }

    @Test
    void testRemoveDuplicatesWithAllUniqueCharacters() {
        String input = "abcdef";
        String result = RemoveDuplicates.removeDuplicates(input);
        assertEquals("abcdef", result, "Expected the same string when all characters are unique.");
    }

}
