
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Codechef{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String input[] = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);

            input = br.readLine().split(" ");
            int p[] = new int[n];
            for(int i=0;i<n;i++)
            {
                p[i] = Integer.parseInt(input[i]);
            }
            System.out.println(findPlayer(p,k,n));
        }
    }
    public static int findPlayer(int[] p,int k, int n)
    {
        int steps = Integer.MAX_VALUE;
        int player = -1;
        for(int i=0;i<n;i++)
        {
            if(p[i]<k)
            {
                if(k%p[i]==0)
                {
                    int cur_steps = k/p[i];
                  
                    if(steps>cur_steps)
                      {
                        steps = cur_steps;
                        player = p[i];
                      }     
                }
            }
            if(p[i]==k)
                return p[i];
        }
        return player;
    }
}