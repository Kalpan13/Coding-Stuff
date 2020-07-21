import java.io.*;
import java.util.*;;

public class AdaKing {
    
    static char board[][] = new char[8][8];
    static int K;
    public static void main (String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while(t-- > 0)
        {
            int k = Integer.parseInt(br.readLine().trim());
            K = k;
            resetBoard();
            printMoves();
        }
    }
    public static void resetBoard()
    {
        
        for(int i=0;i<8;i++)
            Arrays.fill(board[i],'.');
    }
    public static void printMoves()
    {
        int i = 4;
        int j = 4;
        dfs(i,j);
        markX();
        board[i][j] = 'O';
        printBoard();
    }
    public static void printBoard()
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
             System.out.print(board[i][j]);   
            }
            System.out.println();
        }
    }
    public static void dfs(int i,int j)
    {
        K--;
        
        if(K<0)
            return;
        board[i][j] = '-';
        if(K>0)
        {
            if(isValid(i+1,j))
            {  // K--;
                dfs(i+1,j);
            }
            if(isValid(i-1,j))
            {   
              //  K--;
                dfs(i-1,j);
            }
            if(isValid(i,j-1))
            {   
              //  K--;
                dfs(i,j-1);
            }
            if(isValid(i,j+1))
            {   
               // K--;
                dfs(i,j+1);
            }
        }
    }
    public static boolean isValid(int i,int j)
    {
        return i>=0 && i<=7 && j>=0 && j<=7 && board[i][j]=='.';
    }
    public static void markX()
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(board[i][j]=='-')
                {
                    if(i-1>=0 && board[i-1][j]=='.') // Immediate up
                        board[i-1][j] = 'X';
                    
                    if(i+1<=7 && board[i+1][j]=='.') // Immediate down
                    board[i+1][j] = 'X';

                    if(j-1>=0 && board[i][j-1]=='.') // Immediate left
                        board[i][j-1] = 'X';
                    
                    if(j+1<=7 && board[i][j+1]=='.') // Immediate right
                        board[i][j+1] = 'X';

                    if(i-1>=0 && j-1>=0 && board[i-1][j-1]=='.') // Immediate up-left
                        board[i-1][j-1] = 'X';

                    if(i-1>=0 && j+1<=7 && board[i-1][j+1]=='.') // Immediate up-right
                        board[i-1][j+1] = 'X';
 
                    if(i+1<=7 && j-1>=0 && board[i+1][j-1]=='.') // Immediate down-left
                        board[i+1][j-1] = 'X';
                
                    if(i+1<=7 && j+1<=7 && board[i+1][j+1]=='.') // Immediate down-right
                        board[i+1][j+1] = 'X';
                }
            }
        }
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                if(board[i][j]=='-')
                    board[i][j] = '.';
        
    }
}