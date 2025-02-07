package challengeproblems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tit.challengeproblems.linearandbinarysearch.FindMissingPositiveNumber;
import org.junit.jupiter.api.Test;

public class FindMissingPositiveNumberTest {

    @Test
    public void testCase1() {
        int[] nums = {3, 4, -1, 1};
        int expected = 2;
        int result = FindMissingPositiveNumber.findFirstMissingPositive(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 2, 0};
        int expected = 3;
        int result = FindMissingPositiveNumber.findFirstMissingPositive(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        int[] nums = {7, 8, 9, 11, 12};
        int expected = 1;
        int result = FindMissingPositiveNumber.findFirstMissingPositive(nums);
        assertEquals(expected, result);
    }
}
