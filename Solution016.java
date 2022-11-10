import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution016 {

    public static void main(String[] args) {
        BigInteger twoAsBigInteger = BigInteger.valueOf(2);
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0; i<t; i++){
            System.out.println(sumOfDigits(twoAsBigInteger.pow(scanner.nextInt())));
        }
    }

    private static int sumOfDigits(BigInteger n){
        String numStr = n.toString();
        int sum = 0;
        for(int i=0; i<numStr.length(); i++){
            sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        return sum;
    }
}