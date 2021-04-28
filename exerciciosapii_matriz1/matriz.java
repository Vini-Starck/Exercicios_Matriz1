package exerciciosapii_matriz1;

import java.util.Random;

public class matriz {

    /**
     * Multiplica uma matriz por um número
     * @param m int[][]
     * @param valor int
     */
    public static void multiplicar(int[][] m, int valor){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j]*= valor;
            }
        }
    }
    /**
     * Alimenta a matriz com valores aleatorios
     * @param m int [][]
     */
    public static void inserir(int [][] m){
        
        Random rd = new Random();
        
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j] = rd.nextInt(21); // gera números de 0 a 20.
            }
        }
    }
    /**
     * Exibe a matriz selecionada
     * @param m int [][]
     */
    public static void exibir(int [][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}