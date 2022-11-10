import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution007 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(getNthPrimeNumber(n));
        }
    }

    private static int getNthPrimeNumber(int n){
        boolean isFound = false;
        int primeNumberCount = 0;
        int i = 2;
        while(!isFound){
            if(checkPrime(i)){
                primeNumberCount++;
            }
            if(primeNumberCount == n){
                return i;
            }
            i++;
        }

        return -1;
    }

    private static boolean checkPrime(int n){
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }
}