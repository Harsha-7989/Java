// create a array of n elements
// ASSIGN TRUE TO ALL VLAUES.
// mark multiples of prime numbers as false

import java.sql.Array;
import java.util.Scanner;

public class sts1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(seive(n));
    }
    static void seive(int n){
        boolean prime[] = new boolean[n+1];
        for(int i =0; i<=n;i++){
            prime[i] = true;
        }

        for(int p = 2; p*p <= n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = 0; i <= n; i +=p){
                    prime[i] = false;
                }
            }
        }
        for(int i = 2; i<=n; i++){
            if(prime[i] == true){
                System.out.println(i + " ");
            }
        }
    }
}

