
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Morse m = new Morse();

        System.out.print("Translate: ");
        System.out.println(m.translate(reader.nextLine()));
    }

}
