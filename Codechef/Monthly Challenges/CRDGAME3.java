
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
            int pc = Integer.parseInt(input[0]);
            int pr = Integer.parseInt(input[1]);

            
            findWinner(pc,pr);
        }
    }
    public static void findWinner(int pc,int pr)
    {
        int dc = findDigits(pc);
        int dr = findDigits(pr);
        if(dc<dr)
        {
            System.out.println(0+" "+dc);
        }
        else 
        {
            System.out.println(1+" "+dr);
        }  
    }
    public static int findDigits(int a)
    {
        int digit=a/9;
        if(a%9!=0)
            digit++;
        return digit;
    }
}