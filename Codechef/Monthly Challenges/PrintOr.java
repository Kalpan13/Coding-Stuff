
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            while(n>0)
                System.out.print((n--)+" ");    
            
            System.out.println();
        }
    }
}