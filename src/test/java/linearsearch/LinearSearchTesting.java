package linearsearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tit.challengeproblems.linearandbinarysearch.FindMissingPositiveNumber;
import com.tit.searching.linearsearch.firstnegativenumber.LinearSearch;
import org.junit.jupiter.api.Test;

public class LinearSearchTesting {

    @Test
    public void testSearchNegativeNumberWithNegative() {
        LinearSearch ls = new LinearSearch();
        int[] arr = {1, 2, -3, 4, 5};
        int result = ls.searchNegativeNumber(arr);
        assertEquals(2, result);
    }

    @Test
    public void testSearchNegativeNumberWithoutNegative() {
        LinearSearch ls = new LinearSearch();
        int[] arr = {1, 2, 3, 4, 5};
        int result = ls.searchNegativeNumber(arr);
        assertEquals(-1, result);
    }

    @Test
    public void testSearchNegativeNumberAtBeginning() {
        LinearSearch ls = new LinearSearch();
        int[] arr = {-1, 2, 3, 4, 5};
        int result = ls.searchNegativeNumber(arr);
        assertEquals(0, result);
    }
}