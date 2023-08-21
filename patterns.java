public class patterns {
    
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern28(5);
        pattern30(5);
        pattern17(5);
    }
    static void pattern1(int n)
    {
        for(int row = 0; row <= n; row++)
        {
             for(int col = 1; col <= row; col++)
             {
                 System.out.print("* ");
             }
             System.out.println();
        }
        System.out.println();
    }
    

     static void pattern2(int n)
    {
        for(int row = 0; row <= n; row++)
        {
             for(int col = 1; col <= n; col++)
             {
                 System.out.print("* ");
             }
             System.out.println();
        }
        System.out.println();
    }

     static void pattern3(int n)
    {
        for(int row = 0; row <= n; row++)
        {
             for(int col = 1; col <= n-row+1; col++)
             {
                 System.out.print("* ");
             }
             System.out.println();
        }
    }


     static void pattern4(int n)
    {
        for(int row = 0; row <= n; row++)
        {
             for(int col = 1; col <= row; col++)
             {
                 System.out.print(col + " " );
             }
             System.out.println();
        }
    }


    static void pattern5(int n)
    {
        for(int row = 0; row < 2*n; row++)
        {
            int c = row > n ? 2 * n - row: row;; 
             for(int col = 0; col < c; col++)
             {
                 System.out.print("* " );
             }
             System.out.println();
        }
    }

    static void pattern28(int n)
    {
        for(int row = 0; row < 2*n; row++)
        {
            int c = row > n ? 2 * n - row: row;

            int spaces = n-c;
            for(int s = 0; s <= spaces; s++){
                System.out.print(" "); 
            }
             for(int col = 0; col < c; col++)
             {
                 System.out.print("* " );
             }
             System.out.println();
        }
    }


    static void pattern30(int n){
        for(int row = 1; row <= n; row++){
            for(int space = 0; space <= n-row; space++){
                System.out.print("  ");

            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

     static void pattern17(int n){
        for(int row = 1; row <= 2*n; row++){
            int c = row > n ? 2 * n - row:row;

            for(int space = 0; space <= n-c; space++){
                System.out.print(" ");

            }
            for(int col = c; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= c; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        for(int row = 0; row <= 2 * n - 1; row++){
        for(int col = 0; col <= 2 * n - 1; col++){
             int atEveryIndex = Math.min;
             System.out.println(atEveryIndex);
        }
    }
    }
}
