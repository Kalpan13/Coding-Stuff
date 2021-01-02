
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CodeChef{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Set<Integer> hs = new HashSet<Integer>();
            String inputs[] = br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                if(Integer.parseInt(inputs[i])>0)
                    hs.add(Integer.parseInt(inputs[i]));
            }
            System.out.println(hs.size());
        }
    }
}