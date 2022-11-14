import java.io.*;
import java.util.*;

public class Solution030 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int index=2;
        int allSum = 0;
        while(index < 1000000){

            int sum = 0;
            int tempIndex = index;
            while(tempIndex > 0){
                int digit = tempIndex % 10;
                tempIndex = tempIndex / 10;
                sum += Math.pow(digit,num);
            }

            if(sum == index) allSum += index;
            index++;
        }
        System.out.println(allSum);
    }
}