package packzin;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RandomPasswordGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int PASSWORD_LENGTH = 10;
    private static final int MAX_PASSWORDS = 40;

    public static void main(String[] args) {
        List<String> generatedPasswords = new ArrayList<>();
        SecureRandom random = new SecureRandom();

        while (generatedPasswords.size() < MAX_PASSWORDS) {
            StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
            for (int i = 0; i < PASSWORD_LENGTH; i++) {
                int randomIndex = random.nextInt(CHARACTERS.length());
                password.append(CHARACTERS.charAt(randomIndex));
            }

            if (!generatedPasswords.contains(password.toString())) {
                generatedPasswords.add(password.toString());
                System.out.println("Generated password: " + password);
            }
        }
    }
}
