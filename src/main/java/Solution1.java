import java.util.Scanner;


public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a quote: ");
        String quote = scan.nextLine();

        System.out.print("\nPlease enter who said the quote: ");
        String speaker = scan.nextLine();

        System.out.println("Once, " + speaker + " said, \"" + quote + "\"");

    }

}
