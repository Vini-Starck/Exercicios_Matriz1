package exerciciosapii_matriz1;

import java.util.Scanner;

public class ExerciciosAPII_matriz1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [][] m = new int [5][6];
        
        System.out.println("Informe um número para multiplicar uma matriz random: ");
        int valor = leitor.nextInt();
        
        System.out.println("\n=== Matriz random ===\n");
        matriz.inserir(m);
        matriz.exibir(m);
        System.out.println("\n==== Matriz multiplicada ====\n");
        matriz.multiplicar(m, valor);
        matriz.exibir(m);
        
        
    }
    
}
