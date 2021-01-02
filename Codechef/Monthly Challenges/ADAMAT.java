
// Link : https://www.codechef.com/SEPT20B/problems/ADAMAT/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CodeChef {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            
            int mat[][] = new int[n][n];

            for(int i=0;i<n;i++)
            {
                String inputs = br.readLine();
                int j=0;
                for(String element: inputs.split(" "))
                {
                    mat[i][j++]=Integer.parseInt(element);
                }
            }
            System.out.println(findSwaps(mat,n));
        }
    }
    public static int findSwaps(int[][] mat,int n)
    {
        for(int j=n-1;j>=0;j--)
        {
            if(mat[0][j]!=j+1)
            {
                for(int i=0;i<=j;i++)
                {
                    int tp = mat[i][j];
                    mat[i][j]= mat
                }
            }
        }
    }

}
