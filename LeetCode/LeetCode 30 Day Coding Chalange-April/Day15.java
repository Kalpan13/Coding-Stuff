/*

Problem :   Product of Array Except Self
Link : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3300/

*/

/*

Input:  [1,2,3,4]
Output: [24,12,8,6]

*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int [] pre = new int[n];
        Arrays.fill(pre,1);
        int [] post = new int[n];
        int mul=1;
        pre[0]=1;
        post[n-1]=1;
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            post[i]=post[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++)
        {
            post[i] = post[i]*pre[i];  //Using existing array instead of creating new one. 
        }
        return post;
    }
}