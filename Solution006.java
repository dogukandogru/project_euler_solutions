import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            long sum1 = 0;
            for(int i=1; i<=n; i++){
                sum1 += Math.pow(i,2);
            }

            long sum2 = (long)Math.pow((n*(n+1))/2,2);

            System.out.println(Math.abs(sum2 - sum1));
        }
    }
}