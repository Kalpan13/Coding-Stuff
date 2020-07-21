// Code : PTMSSNG
// Link : https://www.codechef.com/JULY20B/problems/PTMSSNG
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MissingPoint {
    public static void main(String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            Set<Integer> xCoordinates = new HashSet<Integer>();
            Set<Integer> yCoordinates = new HashSet<Integer>();
            int n = Integer.parseInt(br.readLine().trim());
            int cnt = 4*n-1;
            while(cnt-- > 0)
            {
                String x_y [] = br.readLine().split(" ");
                int x = Integer.parseInt(x_y[0]);
                int y = Integer.parseInt(x_y[1]);

                if(xCoordinates.contains(x))
                    xCoordinates.remove(x);
                else
                    xCoordinates.add(x);

                if(yCoordinates.contains(y))
                    yCoordinates.remove(y);
                else
                    yCoordinates.add(y);
            }
            for(int ele:xCoordinates)
                {
                    System.out.print(ele);
                    break;
                }
            System.out.print(" ");
            
            for(int ele:yCoordinates)
                {
                    System.out.println(ele);
                    break;
                }
            // System.out.print(xCoordinates.size());
            // System.out.print(yCoordinates.size());

        }
        
    }
}