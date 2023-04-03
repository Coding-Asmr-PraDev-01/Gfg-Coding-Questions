/*
  Question => 
  LC : 74. Search a 2D Matrix
  You are given an m x n integer matrix matrix with the following two properties:

  Each row is sorted in non-decreasing order.
  The first integer of each row is greater than the last integer of the previous row.
  Given an integer target, return true if target is in matrix or false otherwise.
*/

public boolean searchMatrix(int[][] matrix, int target) {
    int i = 0, j = matrix[0].length - 1;
    while(i < matrix.length && j >= 0){
        if(matrix[i][j] == target){
            return true;
        }else if(target < matrix[i][j]){
            j--;
        }else{
            i++;
        }
    }
    return false;
}
