import java.io.*;
import java.util.*;
/**
 * Hello
 */
public class temp_conversion {

    public static void main(String[] args) {
        double temperature;
        Scanner input = new Scanner(System.in);
        temperature = input.nextDouble();
        temperature = (temperature*9/5.0)+32;
        System.out.println("Temp in Farenheit is:"+temperature);
    }
}