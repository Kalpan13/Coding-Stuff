import java.io.*;
import java.util.*;
import java.awt.Point;
class Solve{
    public static void main(String[] args)throws IOException{
        FastReader in=new FastReader();
        PrintWriter wr=new PrintWriter(System.out);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] a=new int[n],b=new int[n];
            for(int i=0;i<n;i++)a[i]=in.nextInt();
            for(int i=0;i<n;i++)b[i]=in.nextInt();
            HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
            HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                if(hm1.get(a[i])==null)hm1.put(a[i],1);
                else hm1.put(a[i],hm1.get(a[i])+1);
            }
            for(int i=0;i<n;i++){
                if(hm2.get(b[i])==null)hm2.put(b[i],1);
                else hm2.put(b[i],hm2.get(b[i])+1);
            }
            boolean ch=true;
            for(int i=0;i<n;i++){
                int x=hm1.get(a[i]),y=0;
                if(hm2.get(a[i])!=null)y=hm2.get(a[i]);
                if((x+y)%2==1)ch=false;
            }
            for(int i=0;i<n;i++){
                int x=hm2.get(b[i]),y=0;
                if(hm1.get(b[i])!=null)y=hm1.get(b[i]);
                if((x+y)%2==1)ch=false;
            }
            if(!ch){
                wr.write("-1\n");
                wr.flush();
                continue;
            }
            //wr.write(hm1+"\n");wr.write(hm2+"\n");
            ArrayList<Integer> ar1=new ArrayList<Integer>();
            ArrayList<Integer> ar2=new ArrayList<Integer>();
            HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                if(!(hm.get(a[i])==null))continue;
                if(hm2.get(a[i])==null){
                    int x=hm1.get(a[i]);
                    x/=2;
                    while(x-->0)ar1.add(a[i]);
                }
                else if(hm1.get(a[i])>hm2.get(a[i])){
                    int x=hm1.get(a[i]),y=hm2.get(a[i]);
                    x=(x-y)/2;
                    while(x-->0)ar1.add(a[i]);
                }
                hm.put(a[i],1);
            }
            hm=new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                if(!(hm.get(b[i])==null))continue;
                if(hm1.get(b[i])==null){
                    int x=hm2.get(b[i]);
                    x/=2;
                    while(x-->0)ar2.add(b[i]);
                }
                else if(hm2.get(b[i])>hm1.get(b[i])){
                    int x=hm2.get(b[i]),y=hm1.get(b[i]);
                    x=(x-y)/2;
                    while(x-->0)ar2.add(b[i]);
                }
                hm.put(b[i],1);
            }
            //wr.write(ar1+"\n");wr.write(ar2+"\n");
            Collections.sort(ar1);Collections.sort(ar2,Collections.reverseOrder());
            int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(a[i]<min1)min1=a[i];
                if(b[i]<min2)min2=b[i];
            }
            min1=Math.min(min1,min2);
            long ans=0;
            n=ar1.size();
            for(int i=0;i<n;i++){
                int min=Math.min(ar1.get(i),ar2.get(i));
                if((long)min>=(long)2*(long)min1)ans+=(long)2*(long)min1;
                else ans+=(long)min;
            }
            wr.write(ans+"\n");
            wr.flush();
        }
    }
}
class FastReader{
    public static StringTokenizer st;
    public static BufferedReader in;
    public static PrintWriter pw;
    FastReader(){
        in = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        st = new StringTokenizer("");
    }
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
    public static String next() throws IOException {
        while(!st.hasMoreElements() || st == null){
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
}