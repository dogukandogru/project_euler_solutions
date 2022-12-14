import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution048 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        BigInteger sum = BigInteger.valueOf(0);
        for(int i=1; i<=num; i++){
            BigInteger val = BigInteger.valueOf(i).pow(i);
            sum = sum.add(val);
        }
        System.out.println(new BigInteger(sum.toString().substring(sum.toString().length()-10)));
    }
}