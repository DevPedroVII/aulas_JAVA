package br.com.aulasgerais;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class RandomPasswordGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int PASSWORD_LENGTH = 12;
    private static final int MAX_PASSWORDS = 40;

    private static SecureRandom random = new SecureRandom();
    private static Set<String> generatedPasswords = new HashSet<>();

    public static void main(String[] args) {
        while (generatedPasswords.size() < MAX_PASSWORDS) {
            String password = generateRandomPassword();
            if (!generatedPasswords.contains(password)) {
                generatedPasswords.add(password);
                System.out.println("Generated password: " + password);
            }
        }
        
        System.out.println("Maximum number of passwords generated (" + MAX_PASSWORDS + ").");
        System.out.println("You can find the password generator here: https://github.com/DevPedroVII");
    }

    private static String generateRandomPassword() {
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            password.append(randomChar);
        }
        return password.toString();
    }
}
