package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AbrirArquivos {

    public static void main(String[] args) {

        File file = new File("C:\\in.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Bloco finally executado com sucesso");
        }
    }
}
