package me.oczi;

import java.util.Arrays;

public class PascalJava {

  public static void main(String[] args) {
    // Test
    int[][] pascal = pascal(10);
    for (int[] p : pascal) {
      System.out.println(Arrays.toString(p));
    }
  }

  /**
   * Get a Array 2D of Pascal triangle.
   * @param n Parameter of Pascal Triangle.
   * @return Array 2D.
   */
  public static int[][] pascal(int n) {
    // Dirty conditions
    // to avoid 0 and 1 parameters.
    // Disabled by default
    /*if (n == 0) {
      return new int[][]{};
    } else if (n == 1) {
      return new int[][]{{1}};
    }*/

    // We need to declare the array before
    // put values inside.
    int[][] result = new int[n][n];
    result[0] = new int[]{1};
    result[1] = new int[]{1, 1};
    for (int row = 2; row < n; row++) {
      // +1 for new size of row
      result[row] = new int[row + 1];
      result[row][0] = 1;
      for (int col = 1; col < row; col++) {
        result[row][col] = result[row-1][col] + result[row-1][col-1];
      }
      // Hardcoded end.
      // Like first value, it will always 1.
      result[row][row] = 1;
    }
    return result;
  }
}