/*
    Problem : Ransom Note
    Link : https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3318/
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int letter[] = new int[26];
        for(char c:magazine.toCharArray())
        {
                letter[c -'a']++;         //Finding frequency of the letters in magazine
        }
        for(char c:ransomNote.toCharArray())
        {
                letter[c-'a']--;
                if(letter[c-'a']<0)    // If frequency of letter <0 -> ransomNot can't be created
                    return false;
        }
        return true;
    }
}

