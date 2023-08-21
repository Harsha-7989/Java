public class NQueens {
    public static void main(String[] args) {
        
    }
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }

        int count = 0;
        // place queen and check the every row and col
         for(int col = 0; col < board.length; col++)
         {
                if(isSafe(board, row, col)
                {
                    board[row][col] = true;
                    count += queens(board, row+1);
                    board[row][col] = false;  
                }
            
         }
         return count;

    }


    private static void display(Boolean[][] board){
        for(boolean[] row : board)
        {
            for(boolean element : row)
            {
                if(element)
                {
                    System.out.println("Q ");
                }
                else
                {
                    System.out.println("X ");
                }

            }
            System.out.println();
        }
    }

}
