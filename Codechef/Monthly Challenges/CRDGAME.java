//CRDGAME
// Link : https://www.codechef.com/JULY20B/problems/CRDGAME

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int chefPoints = 0;
            int mortyPoints = 0;
            while(n-- > 0)
            {
                String input[] = br.readLine().split(" ");
                int a = findPower(Integer.parseInt(input[0]));
                int b = findPower(Integer.parseInt(input[1]));
                if(a==b)
                    {
                        chefPoints++;
                        mortyPoints++;
                    }
                else if(a>b)
                    chefPoints++;
                else mortyPoints++;
            }
            if(chefPoints>mortyPoints)
            {
                System.out.println("0 "+chefPoints);
            }
            else if(chefPoints<mortyPoints)
            {
                System.out.println("1 "+mortyPoints);
            }
            else
            {
                System.out.println("2 "+chefPoints);
            }
        }
    }
    public static int findPower(int a)
    {
        int power = 0;
        while(a>0)
        {
            power+=a%10;
            a/=10;
        }
        return power;
    }
}