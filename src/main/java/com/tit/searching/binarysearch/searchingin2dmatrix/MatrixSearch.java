package com.tit.searching.binarysearch.searchingin2dmatrix;
public class MatrixSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // case: empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int left = 0;
        int right = numRows * numCols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert 1D index to 2D indices
            int row = mid / numCols;
            int col = mid % numCols;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                // Search right half
                left = mid + 1;
            } else {
                // Search left half
                right = mid - 1;
            }
        }

        return false; // Element not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int target = 3;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + target + (found ? " found." : " not found."));
    }
}
