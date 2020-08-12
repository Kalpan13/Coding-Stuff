/*
  Problem :   First Unique Character in a String
  Link : https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320/
*/

class Solution {
    public int firstUniqChar(String s) {
      char[] chars = s.toCharArray();
      int[] charArray = new int[26];

      for (char c : chars) {
        charArray[(int)c - 'a']++;      //Storing the frequency of each character
      }

      for (int i = 0; i < chars.length; i++) {
        if (charArray[(int)chars[i] - 'a'] == 1) {
          return i;
        }
      }
      return -1;  
    }
}