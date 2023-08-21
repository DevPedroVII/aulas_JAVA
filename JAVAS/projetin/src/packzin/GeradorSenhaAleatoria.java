package packzin;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeradorSenhaAleatoria {
    private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int TAMANHO_SENHA = 12;
    private static final int MAX_SENHAS = 40;

    private static SecureRandom random = new SecureRandom();
    private static Set<String> senhasGeradas = new HashSet<>();

    public static void main(String[] args) {
        while (senhasGeradas.size() < MAX_SENHAS) {
            String senha = gerarSenhaAleatoria();
            if (!senhasGeradas.contains(senha)) {
                senhasGeradas.add(senha);
                System.out.println("Senha gerada: " + senha);
            }
        }
        
        System.out.println("Número máximo de senhas geradas (" + MAX_SENHAS + ").");
        System.out.println("Você pode encontrar o gerador de senhas aqui: https://github.com/DevPedroVII");
    }

    private static String gerarSenhaAleatoria() {
        StringBuilder senha = new StringBuilder(TAMANHO_SENHA);
        for (int i = 0; i < TAMANHO_SENHA; i++) {
            int indiceAleatorio = random.nextInt(CARACTERES.length());
            char caractereAleatorio = CARACTERES.charAt(indiceAleatorio);
            senha.append(caractereAleatorio);
        }
        return senha.toString();
    }
}
