/*
    Problem : 15
    Title : 3Sum
    Link : https://leetcode.com/problems/3sum/
*/

/*
Input = [-1, 0, 1, 2, -1, -4],

Output:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                int st = i+1;
                int end = n-1;
                int sum = nums[i];
                if(sum>0)
                    break;
                while(st<end)
                {
                    if(nums[st]+nums[end]==-sum)
                    {
                        ans.add(Arrays.asList(nums[i], nums[st], nums[end]));
                        while(st<end && nums[st]==nums[st+1])
                            st++;
                        while(st<end && nums[end]==nums[end-1])
                            end--;
                        st++;
                        end--;
                    }
                    else if(nums[st]+nums[end] < -sum)
                    {
                        st++;
                    }
                    else
                    {
                        end--;
                    }
                }
            }
            
        }
        return ans;
    }
}

/* 
    Idea 

    * After Sorting the array keeping one element constant find the remaining 2 elements having such that
    element2 + element3 = (-element1)

*/ 