
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class CHEFSTEP {
    public static void main(String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String inputs[] = br.readLine().split(" ");
            int n = Integer.parseInt(inputs[0]);
            int k = Integer.parseInt(inputs[1]);
            long step;
            StringBuffer ans = new StringBuffer();
            for(int i = 0; i < n; i++)
            {
                step = Long.parseLong(br.readLine().trim());
                if(step%k==0)
                    ans = ans.append("1");
                else
                    ans = ans.append("0");
            }
            System.out.println(ans);
        }
    }    
}
