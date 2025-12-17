package SEE;

import java.util.Scanner;

public class External {
    public int[] emarks = new int[5];

    public void getExternals() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter external marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            emarks[i] = sc.nextInt();
        }
    }
}
