
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Codechef{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String s = br.readLine().trim();
            String p = br.readLine().trim();   
            System.out.println(findKMP(s,p));
        }
    }
    public static String findKMP(String s, String p)
    {
        char S[] = s.toCharArray();
        char P[] = p.toCharArray();
        
        int c[] = new int[26];
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<S.length;i++)
        {
            c[S[i]-'a']++;
        }
        char st = p.charAt(0);
        for(int i=0;i<P.length;i++)
        {
            c[P[i]-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if((st-'a')>i)
            {
                while(c[i]>0)
                {
                    sb.append((char)(i+'a'));
                    c[i]--;
                }
            }
            else if((st-'a')==i)
            {
                while(c[i]>0)
                {
                    sb.append((char)(i+'a'));
                    c[i]--;
                }
                sb.append(p);
                // while(c[i]>1)
                // {
                //     sb.append((char)(i+'a'));
                //     c[i]--;
                // }
                // for(int j=0;j<P.length;j++) 
                // {
                //     c[P[i]-'a']--;
                // }
                // sb.append(p);
            }
            else 
            {
                while(c[i]>0)
                {
                    sb.append((char)(i+'a'));
                    c[i]--;
                }
            }        
        }
        return sb.toString();
    }
}