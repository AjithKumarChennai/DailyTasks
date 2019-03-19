//Checking whether the String is palidrome or not
public class MainClass {

    public static void main(String args[]) {

        String str = "malayalam";

        char[] ch = str.toCharArray();

        int length = ch.length;

        int div = length/2;

        int count = 0;

        for (int i = 0, j = length-1; i < length-1 && j > 0; i++, j--) {

            if (ch[i] == ch[j] && i != div) {

                count++;

            } else {

                break;

            }

        }

        String result = count == div ? "Panlindrome" : "Not a palindrome";

        System.out.println(result);

    }

}
