public class Main {
 public static void main(String args[]) {
 int result = 0;
 int x = 2;
 result = x++ + x++ * --x / x++ - --x + 3 >> 1 | 2;
 System.out.println("result = " +result);
 }
}