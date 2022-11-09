import java.io.*;
import java.util.*;

public class Solution013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;

        scanner.nextLine();

        for(int i=0; i<n; i++){
            String longString = scanner.nextLine();
            sum += Long.parseLong(longString.substring(0,11));
        }
        System.out.println(String.valueOf(sum).substring(0,10));
    }
}