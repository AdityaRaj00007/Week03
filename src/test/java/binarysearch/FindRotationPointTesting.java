package binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tit.challengeproblems.linearandbinarysearch.FindMissingPositiveNumber;
import com.tit.searching.binarysearch.rotationpoint.FindRotationPoint;
import com.tit.searching.linearsearch.firstnegativenumber.LinearSearch;
import org.junit.jupiter.api.Test;

public class FindRotationPointTesting {

    @Test
    public void testFindRotationPointRotated() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int rotationIndex = FindRotationPoint.findRotationPoint(arr);
        assertEquals(4, rotationIndex);
    }

    @Test
    public void testFindRotationPointNotRotated() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotationIndex = FindRotationPoint.findRotationPoint(arr);
        assertEquals(0, rotationIndex);
    }

    @Test
    public void testFindRotationPointSingleElement() {
        int[] arr = {1};
        int rotationIndex = FindRotationPoint.findRotationPoint(arr);
        assertEquals(0, rotationIndex);
    }
}
