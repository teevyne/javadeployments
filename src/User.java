import java.security.SecureRandom;

public class User {
    public static void main(String[] args) {
        System.out.println("Money");

        System.out.println(generateApiKey());
        System.out.println();
        System.out.println(generateApiSecret());
    }

    private static final String NUMERIC_STRING = "0123456789";

    public static String generateApiKey() {
        int count = 10;

        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }


    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!,.?";
    public static String generateApiSecret() {
        StringBuilder builder = new StringBuilder();
        int count = 30;
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

}
