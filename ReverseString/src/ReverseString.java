import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    input.close();
    String reversed = reverseString(str);
    System.out.println("Reversed string: " + reversed);
  }
  
  public static String reverseString(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length / 2; i++) {
      char temp = chars[i];
      chars[i] = chars[chars.length - i - 1];
      chars[chars.length - i - 1] = temp;
    }
    return new String(chars);
  }
}
