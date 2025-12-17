import CIE.Internals;
import SEE.External;

public class FinalMarks {
    public static void main(String[] args) {

        Internals in = new Internals();
        External ex = new External();

        in.getPersonal();
        in.getInternals();
        ex.getExternals();

        System.out.println("\n----- FINAL MARKS -----");
        System.out.println("USN  : " + in.usn);
        System.out.println("Name : " + in.name);

        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) +
                    " = " + (in.imarks[i] + ex.emarks[i]));
        }
    }
}
