import java.util.Arrays;
public class Tester{
  public static void main(String [] args) {
    int [] a = {3,4,1,2,5,6};
    int [][] b = {{1,2,3,4,5},
                {3,2,1,6,4},
                {3,5,21,6,-2}};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    System.out.println(Arrays.toString(ArrayOps.sumRows(b)));
  }
}
