import java.io.BufferedReader; // Usado para ler texto de um fluxo de entrada de caracteres
import java.io.FileReader; // Usado para ler arquivos de caracteres. Projetado para leitura simples e direta de arquivos de caracteres
import java.io.IOException; // Usado durante operações de arquivo ou fluxo para lidar com exceções relacionadas à entrada e saída (E/S) 

public class LeitorDeTxt {
    public static void main(String[] args) {
        String filename = "leia-me.txt"; // Nome do arquivo que vai ser lido
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            // Usa-se try-with-resources para abrir e fechar automaticamente o arquivo
            String line;
            System.out.println("\n==------|" + filename + "|------== ");
            while ((line = bufferedReader.readLine()) != null) {
                // Enquanto tiver linhas no arquivo, irá lê-las.
                System.out.println(line); // Imprime, no console, a linha que está sendo lida
            }
        } catch (IOException e) {
            // Este bloco é executado caso ocorra um erro de entrada/saída (E/S)
            System.err.println("Erro na leitura do arquivo: " + e.getMessage()); // Imprime a mensagem de erro

        }
    }
}
