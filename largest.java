import java.io.*;
import java.util.*;
public class largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println("Largest Number is"+num1);
            }
            else{
                System.out.println("Largest Number is"+num3);
            }
        }
        else{
            if(num2>num3){
                System.out.println("Largest Number is"+num2);
            }
            else{
                System.out.println("Largest Number is"+num3);
            }
        }

    }
    
}
