import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

class Stacks{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            List<Integer> stacks = new ArrayList<Integer>();
            
            String input[] = br.readLine().trim().split(" "); 
            int nums[] = new int[input.length];
            for(int i=0;i<input.length;i++)
                nums[i] = Integer.parseInt(input[i]);

            int minSoFar = Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++)
            {
                int ele = nums[i];
                int min_found = Integer.MAX_VALUE;
                int min_ind = -1;
                for(int j=0;j<stacks.size();j++)
                {
                    int stack = stacks.get(j);
                    
                    if(ele<stack && min_found>stack)
                    {
                //        System.out.print("Min Found");
                        min_found = stack;
                        min_ind = j;
                    }
                }
                if(min_ind==-1)
                {
                    stacks.add(ele);    
                }
                else
                {
                    stacks.set(min_ind,ele);
                }
            }
            System.out.print(stacks.size()+ " ");
            for(Integer stack : stacks)
            {
                System.out.print(stack + " ");
            }
            System.out.println();
        }
    }
}