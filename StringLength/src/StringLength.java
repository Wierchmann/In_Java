import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            int length = 0;
            for(int i = 0; str.charAt(i) != '\0'; i++) {
                length++;
            }

            System.out.println("Length of the string: " + length);
        }
    }
}
