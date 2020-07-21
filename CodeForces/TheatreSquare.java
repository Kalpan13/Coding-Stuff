
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheatreSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().trim().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        findFlagStone(m,n,a);
    }
    public static void findFlagStone(int m,int n,int a)
    {
        double _m = m;
        double _n = n;
        double _a = a;
        long a1 = (long)Math.ceil(_m/_a);
        long  a2 = (long)Math.ceil(_n/_a);
        System.out.print(a1*a2);       

    }
}