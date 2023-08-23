package packzin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class RelogioBrasilia {
    public static void main(String[] args) {
        while (true) {
            Date horaAtual = new Date();
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            formatoHora.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo")); // Configuração do fuso horário de Brasília
            
            String horaBrasilia = formatoHora.format(horaAtual);
            System.out.println("Hora de Brasília: " + horaBrasilia);

            try {
                Thread.sleep(1000); // Aguarda 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
