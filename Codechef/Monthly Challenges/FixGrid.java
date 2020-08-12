
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String input[] = br.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            char c[][] = new char[m][n];
            for(int i=0;i<m;i++)
            {
                String row = br.readLine().trim();
                c[i] = row.toCharArray();
            }
            int j = m-1;
            int cnt = 0;
            for(int i=0;i<n-1;i++)
            {
                if(c[m-1][i]=='D')
                cnt++;
            }
            for(int i=0;i<m-1;i++)
            {
                if(c[i][n-1]=='R')
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}