package com.example.program;

import java.io.IOException;
import java.util.Scanner;

public class Jumping {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int i = 0;
        while(i<c.length) {
            if (c[i] == 1) {
                energy -= 2;
            }
            energy--;
            if ((i+k)>c.length) {
                i = (i+k) % c.length;
            } else {
                i += k;
            }
        }
        return energy;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }
        */
        int[] c = {1 ,1 ,1 ,0 ,1 ,1 ,0 ,0 ,0 ,0};
        int k = 3;
        int result = jumpingOnClouds(c, k);

        System.out.println("Result: "+result);
        /*
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        */
    }
}