
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
            int h = Integer.parseInt(input[0]);
            int p = Integer.parseInt(input[1]);

            while(h>0 && p>0)
            {
                h = h-p;
                p /= 2;
            }
            if(h<1)
                System.out.println(1);
            else 
                System.out.println(0);
        }
    }
}