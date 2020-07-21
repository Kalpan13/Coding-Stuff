// CHEFSTR1
// Link : https://www.codechef.com/JULY20B/problems/CHEFSTR1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0)
        {
            int sum = 0;
            
            int n = Integer.parseInt(br.readLine().trim());
            if(n<2)
                System.out.println(0);
            else {
                String input[] = br.readLine().split(" ");
                for(int i =0; i<input.length-1;i++)
                {
                    sum+= countString(Integer.parseInt(input[i]),Integer.parseInt(input[i+1]));
                }
                System.out.println(sum);
            }
        }
    }
    public static int countString(int end,int start)
    {   
        if(end>start)
            return end-start-1;
        else
            return start-end-1;
        //else return 0;
    }
}