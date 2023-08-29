package packzin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class RelogioBrasilia {
    public static void main(String[] args) {
        // Loop infinito para atualizar o relógio a cada segundo
        while (true) {
            // Obtém a hora atual
            Date horaAtual = new Date();
            
            // Define o formato da hora para "HH:mm:ss"
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            
            // Configura o fuso horário para Brasília
            formatoHora.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
            
            // Formata a hora atual de acordo com o fuso horário de Brasília
            String horaBrasilia = formatoHora.format(horaAtual);
            
            // Exibe a hora de Brasília
            System.out.println("Hora de Brasília: " + horaBrasilia);

            try {
                // Aguarda 1 segundo antes da próxima atualização
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
