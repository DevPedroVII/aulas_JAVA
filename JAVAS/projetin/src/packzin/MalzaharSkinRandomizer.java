package packzin;

import java.util.Random;

public class MalzaharSkinRandomizer {
    public static void main(String[] args) {
        String[] malzaharSkins = {
            "Malzahar",
            "Malzahar Vizir",
            "Malzahar Príncipe das Sombras",
            "Malzahar Gênio da Lâmpada",
            "Malzahar Suserano",
            "Malzahar Dia Nevado",
            "Malzahar Hextec",
            "Malzahar Quebra-mundos",
            "Melzahar Bees!",
            "Malzahar Galante",
            "Malzahar Três Honras"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(malzaharSkins.length);

        String selectedSkin = malzaharSkins[randomIndex];
        System.out.println("Skin selecionada: " + selectedSkin);
    }
}