import java.util.HashMap;
import java.util.Map;

public class Leet13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

//    Roman to Integer conversion
/**
 * If the number is smaller than one after we need to subtract
 * Ex: IV (5-4), IX (10-1), XL (50 - 10), XC (100 - 10), CD (500-100), CM (1000 - 100)
 */
public static int romanToInt(String input) {
    int total = 0;
    Map<Character, Integer> roman = new HashMap<>();
    roman.put('I', 1);
    roman.put('V', 5);
    roman.put('X', 10);
    roman.put('L', 50);
    roman.put('C', 100);
    roman.put('D', 500);
    roman.put('M', 1000);

    for (int i = 0; i < input.length() -1; i++) {
        if (roman.get(input.charAt(i)) < roman.get(input.charAt(i + 1))) {
            total -= roman.get(input.charAt(i));
        } else {
            total += roman.get(input.charAt(i));
        }

    }
    return total + roman.get(input.charAt(input.length() - 1));

}
}
