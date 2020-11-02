package alggeneticonrainhas;

/**
 * Algoritmo genético que resolve o problema das N-Rainhas
 *
 * @author Rafael D'Addio
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        int origem, i;
        
        String nextLine;
        String[] split;

        File file = new File("C:\\Users\\vinic\\Desktop\\alggeneticonrainhas\\grafos\\");
        File afile[] = file.listFiles();
        System.out.println("file"+file);
        System.out.println("afile[]"+afile[0]);
        i = 0;
        System.out.println("afile"+afile.length);   
        for (int j = afile.length; i < j; i++) {
            File arquivos = afile[i];

            String diretorio = "C:\\Users\\vinic\\Desktop\\alggeneticonrainhas\\grafos\\" + arquivos.getName();
            
            //Este trecho encontra a largura/altura da minha matriz
            LineNumberReader lineCounter = new LineNumberReader(new InputStreamReader(new FileInputStream(diretorio)));
            nextLine = lineCounter.readLine();
            split = nextLine.split(" ");    
            int tamanhoMatriz = split.length;
            //Cria a matriz do tamanho encontrado
            double matrizDistancia[][] = new double[tamanhoMatriz][tamanhoMatriz];
            //Reseta a posição das linhas
            lineCounter = new LineNumberReader(new InputStreamReader(new FileInputStream(diretorio)));
            //Enquanto houver linha...
            while ((nextLine = lineCounter.readLine()) != null) {
                    split = nextLine.split(" ");
                    tamanhoMatriz = split.length;
                    //Alimento a matriz com os pesos em cada lugar
                    for (int k = 0; k < tamanhoMatriz; k++) {
                        //if ((Integer.valueOf(split[k])) != 0) {
                            int peso = (Integer.valueOf(split[k]));
                            origem = lineCounter.getLineNumber()-1;
                            int destino = k;
                            System.out.println("linha"+origem);
                            System.out.println("destino"+destino);

                            matrizDistancia[origem][destino] = peso;
                            System.out.println("matrizDistancia"+matrizDistancia[origem][destino]);
                        }
                    //}

                }
            }
        }       
        //AlgoritmoGenetico ag = new AlgoritmoGenetico(8, 100); //instancia tamanho do  tabuleiro e tamanho da população
        //ag.executa(100, 4, 15, "roleta", 1); //executa
    }

}
