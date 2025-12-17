package CIE;

import java.util.Scanner;

public class Internals extends Personal {
    public int[] imarks = new int[5];

    public void getInternals() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter internal marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            imarks[i] = sc.nextInt();
        }
    }
}
