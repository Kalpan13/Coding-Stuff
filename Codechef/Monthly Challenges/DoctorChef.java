
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class DoctorChef {
    public static void main(String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int x = Integer.parseInt(br.readLine().trim());
            int pop [] = new int[n];
            String Inputs[] = br.readLine().split(" ");
            for(int i = 0; i < n; i++)
            {
                pop[i] = Integer.parseInt(Inputs[i]);
            }
            System.out.println(findDays(pop,x,n));
        }
    }    
    public static int findDays(int pop[],int x,int n)
    {
        int maxPop = 0;
        for(int i=0;i<n;i++)
        {
            maxPop = Math.max(maxPop,pop[i]);
        }
        if(maxPop<=x)
            return n;
        while(x)
    }
}
