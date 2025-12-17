package CIE;

import java.util.Scanner;

public class Personal {
    public String usn, name;

    public void getPersonal() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
}
