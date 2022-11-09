import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(sumOfEvenFibNums(n));
        }
    }
    
    private static long sumOfEvenFibNums(long n){
        long i1 = 1;
        long i2 = 2;
        long sum = 0;

        while(i2 < n){
            if(i2 % 2 == 0)
                sum += i2;
            
            long oldI2 = i2;
            i2 = i1 + i2;
            i1 = oldI2;
        }
        
        return sum;
    }
}
