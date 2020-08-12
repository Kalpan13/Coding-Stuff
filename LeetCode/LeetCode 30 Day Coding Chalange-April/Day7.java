/*
Counting Elements
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3289/
*/
class Solution {
    public int countElements(int[] arr) {
        int a[] = new int[1100];
        int max_i=0;
        int cnt =0;
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]++;
            max_i = max_i<arr[i]?arr[i]:max_i;
        }
        for(int i=0;i<=max_i;i++)
        {
            if(a[i]>0 && a[i+1]>0)
            {   
                cnt = cnt + a[i];
            }    
        }
        return cnt;
    }
}