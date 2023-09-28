import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
class palindrome
 {
public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    int n,sum=0,r,temp;
    System.out.println("Enter the number:");
    n = input.nextInt();
    temp=n;
    while(n!=0)
    {
        r=n%10;
        sum = sum*10+r;
        n = n/10;
    }

    if(sum ==temp)
    System.out.println("Given number is palndrome");
    else 
    System.out.println("Given number is not palindrome");
}

    
}
