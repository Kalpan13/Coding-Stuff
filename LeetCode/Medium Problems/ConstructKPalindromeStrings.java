
/*

Problem : 1400
Title : Construct K Palindrome Strings
Link : https://leetcode.com/problems/construct-k-palindrome-strings/

*/
class Solution {
    public boolean canConstruct(String s, int k) {
        char c[] = new char[26];
        int odd_cnt=0;
        
        if(s.length()<k)
            return false;
        
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)-'a']++;
        }
        for(int i=0;i<c.length;i++)
            if(c[i]%2==1)
                odd_cnt++;
        
        if(odd_cnt>k)
            return false;
        return true;
    }
}