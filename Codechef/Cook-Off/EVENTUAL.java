import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class EVENTUAL {
    public static void main(String[] args) throws java.lang.Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            System.out.println(reduceString(s,n));
        }
    }
    public static String reduceString(String s, int n)
    {
        int fre[] = new int[26];
        for(char c: s.toCharArray())
        {
            fre[c-'a']++;
        }
        for(int i =0;i<26;i++)
        {
            if(fre[i]%2!=0)
                return "NO";
        }
        return "YES";
    }   
}