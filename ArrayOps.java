public class ArrayOps{
  public static int sum(int[] arr){
    int a = arr.length;
    int b = 0;
    for (int i = 0; i < a; i++){
      b = b + arr[i];
    }
    return b;
  }

  public static int largest(int [] arr){
    int a = 0;
    for (int i = 0; i < arr.length; i++){
      if ( arr[i] > a){
        a = arr[i];
      }
    }
    return a;
  }

  public static int [] sumRows (int [][] matrix){
    int [] SumRowArr = new int [matrix.length];
    for (int i = 0; i < matrix.length; i ++){
      SumRowArr[i] = sum(matrix[i]);
    }
    return SumRowArr;
  }

  public static int [] largestInRows(int [][] matrix){
    int [] biggestnumbers = new int [matrix.length];
    for ( int i = 0; i < matrix.length; i++){
      biggestnumbers[i] = largest(matrix[i]);
    }
    return biggestnumbers;
  }

  public static int sum ( int [][] arr){
    int [] sumrows = sumRows(arr);
    return sum(sumrows);
  }

  public static int [] sumCols(int[][] matrix){
    int [] SumColArr = new int [matrix[0].length];
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[0].length; j++){
        SumColArr[j] = SumColArr[j] + matrix[i][j];
      }
    }
    return SumColArr;
  }

  public static boolean isRowMagic(int[][]matrix){
    int [] sumrows = sumRows(matrix);
    int a = 0;
    for (int i = 0; i < sumrows.length; i++){
      if (sumrows[0] == sumrows[i]){
        a = a + 1;
      }
    }
    return (a == matrix.length);
  }
}
