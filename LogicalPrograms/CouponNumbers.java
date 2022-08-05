package LogicalPrograms;
import java.util.Random;

public class CouponNumbers {
    public static String main(String[] args) {
        int codeLength = 0;
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < codeLength; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(String.valueOf(c));
        }
        String output = sb.toString();
        System.out.println(output);
        return output;
    }
}

