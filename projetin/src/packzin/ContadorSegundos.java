package packzin;

public class ContadorSegundos {
    public static void main(String[] args) {
        int segundos = 0;
        
        while (true) {
            System.out.println("Segundos: " + segundos);
            
            try {
                Thread.sleep(1000); // Aguarda 1 segundo (1000 milissegundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            segundos++;
        }
    }
}
