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
}