package atividadeAlgoritimo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class SegundaQuestao {

    static int Vertices = 5000;

    public static void main(String[] args) {
        Scanner in;
        LinkedList[] list = new LinkedList[Vertices];
        int i = 0;
        String[] numero = new String[5000];
        ligarListas(list);
        try {
            in = new Scanner(new FileReader("C://Users//paulo//Documents//NetBeansProjects//com-friendster.top5000.cmty.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] array = line.split("\t");
                numero[i] = array[0];
                for (int j = 0; j< array.length - 1; j++){
                    list[i].add(array[j+1]);
                }
                i++;
            }
            print(list, numero);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void ligarListas(LinkedList[] list) {
        for (int i = 0; i < Vertices; i++) {
            list[i] = new LinkedList();
        }
    }

    static void print(LinkedList[] list, String numero[]) {
        for (int i = 0; i < Vertices; i++) {
            System.out.print(numero[i] + ": ");
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print(list[i].get(j) + " ; ");
            }
            System.out.println();
        }
    }

}