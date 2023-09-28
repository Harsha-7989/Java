package harsha;
import java.util.*;

// class hdkh
// {
//     public static void main(String[] args)
//     {
//         int salary = 100000;
//         if (salary>50000)
//         {
//             salary += salary+50000;
//         }
//         System.out.println(salary);
//     }
    
// }
// class fibonacci{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int p = 0;
//         int i = 1;
//         int count = 2;
//         while (count<=n){
//             int temp =i;
//             i=i+p;
//             p = temp;
//             count++;

//         }
//         System.out.println(i);

//     }
// }
// class repeat{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int c = 0;
//         while(n>0){
//             int rem = n%10;
//             if(rem ==5){
//                 c++;
        
//             }
//             n = n/10;
//         }
//         System.out.println(+c);

          
//     }
// }


// class revrse{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int c = 0;
//         while(n>0){
//             int rem = n%10;
//             n = n/10;
//             c = c*10+rem;

//         }
//         System.out.println(+c);

          
//     }
// }
// class calculator{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int ans=0;
//         while(true){
//             System.out.println("Enter the operator:");
//             char op = sc.next().trim().charAt(0);
//             if(op =='+' || op =='-' || op == '*' || op == '/' || op == '%') 
//             {
//                 System.out.print("Enter the two numbers:");
//                 int num1 = sc.nextInt();
//                 int num2 = sc.nextInt();
//                 if(op == '+'){
//                     ans = num1+num2;
//                 }
               
//                 if(op == '-'){
//                     ans = num1-num2;
//                 }
//                 if(op == '*'){
//                     ans = num1*num2;
//                 }
//                 if(op == '/'){
//                     ans = num1/num2;
//                 }
//                 if(op == '%'){
//                     ans = num1%num2;
//                 }
//             }else if(op == 'x' || op == 'X')
//             {
//                   break;  
//                 }
//                 else{
//                     System.out.println("Invaid operation");
//                 }
//                 System.out.println(+ans);

        
//         }

//     }
// }







class switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch(day){
            case 1 -> system.out.println("weekday");
        }

    }
}