import java.util.Arrays;
import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer arab = scanner.nextInt();
        String roman = toRomanNumber(arab);


        System.out.println(arab + " = " + roman);

    }

    private static String toRomanNumber(int number) {

        String original = "";
        char i = 'I';

        char[] repeat = new char[number];
        Arrays.fill(repeat, i);
        original = original + new String(repeat);


        original = original.replace("IIIII", "V");
        original = original.replace("IIII", "IV");
        original = original.replace("VV", "X");
        original = original.replace("VIV", "IX");
        original = original.replace("XXXXX", "L");
        original = original.replace("XXXX", "XL");
        original = original.replace("LL", "C");
        original = original.replace("LXL", "XC");


        return original;


    }


}