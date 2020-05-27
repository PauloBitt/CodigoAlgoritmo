package atividadeAlgoritimo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class AtGrafo25000 {

    static int Vertices = 30000;

    public static void main(String[] args) {
        Scanner in;
        LinkedList[] list = new LinkedList[Vertices];
        int i = 0;
        String[] numero = new String[30000];
        ligarListas(list);
        try {
            in = new Scanner(new FileReader("C://Users//paulo//Documents//NetBeansProjects//grafo-25000.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] array = line.split("\t");
                numero[i] = array[0];
                for (int j = 0; j< array.length - 1; j++){
                    list[i].add(array[j+1]);
                }
                i++;
            }
            calcularVertices(list);
            print(list, numero);
            complexidade(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void ligarListas(LinkedList[] list) {
        for (int i = 0; i < Vertices; i++) {
            list[i] = new LinkedList();
        }
    }
    static void calcularVertices(LinkedList[] list){
        int total = 0;
        for (int i = 0; i < Vertices; i++){
            total += list[i].size();
        }
        System.out.println("O grafo tem total de: "+total); 
    
    }
    static void print(LinkedList[] list, String numero[]) {
        for (int i = 0; i < Vertices; i++) {
            System.out.print(numero[i] + " tem " + list[i].size() + " Vértices Adj.");
            System.out.println();
         }
    }
    static void complexidade(LinkedList[] listas) {
        int complex = 0;
        for (int i = 0; i <Vertices; i++) {
            complex += listas[i].size() + (listas[i].size()+1);
        }
        System.out.println("O grafo tem a complexidade "+complex);
    }
}

