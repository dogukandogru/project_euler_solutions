import java.io.*;
import java.util.*;

public class Solution022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> names = new ArrayList<>();
        for(int i=0; i<n; i++){
            String name = scanner.nextLine();
            names.add(name);
        }

        Collections.sort(names);

        int q = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<q; i++){
            String name = scanner.nextLine();
            System.out.println(calculateScore(name) * (names.indexOf(name)+1));
        }

    }

    private static int calculateScore(String name){
        int score = 0;

        for(int i=0; i<name.length(); i++){
            score += String.valueOf(name.charAt(i)).toLowerCase().charAt(0) - 'a' + 1;
        }

        return score;
    }
}