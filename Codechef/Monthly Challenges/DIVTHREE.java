import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Codechef {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while(t-- >0)
        {

            String ndk[] = br.readLine().split(" ");
            int n = Integer.parseInt(ndk[0]);
            int k = Integer.parseInt(ndk[1]);
            int d = Integer.parseInt(ndk[2]);
            
            String A[] = br.readLine().split(" ");
            int a[] = new int[n];
            int sum = 0;
            int dc = 0;
            for(int i=0;i<n;i++)
            {
                a[i] = Integer.parseInt(A[i]);
                sum+=a[i];
                if(sum>k)
                {
                    sum-=k;
                    dc++;
                }
                
            }
            dc+=sum/k;
            System.out.println(Math.min(dc,d));
        }  
    }
}

// n = 2
// k = 5 
// d = 10 

// 19 2
