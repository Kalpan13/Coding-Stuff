import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Codechef {
    public static void main(String[] args) throws java.lang.Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[n];
            String inputs[] = br.readLine().split(" ");

            for(int i=0;i<n;i++)
            {
                a[i] = Long.parseLong(inputs[i]);
            }
            System.out.println(findOr(n,a));
        }
    }
    public static String findOr(int n,long a[])
    {   
        long or;
        Set<Long> hs = new HashSet<Long>();
        for(int i=0;i<n;i++)
        {   or = a[i];
            for(int j=i;j<n;j++)
            {
                or = or | a[j];
                if(hs.contains(or))
                {
                    return "NO";
                }
                else
                {
                    hs.add(or);
                }
            }    
        }
        return "YES";
    }
}