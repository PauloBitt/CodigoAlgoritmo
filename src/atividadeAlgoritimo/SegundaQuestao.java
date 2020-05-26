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
        int indice = 0;
        ligarListas(list);
        try {
            in = new Scanner(new FileReader("C://Users//paulo//Documents//NetBeansProjects//com-friendster.top5000.cmty.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                list[indice].add(line);
                indice++;
            }
            print(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void ligarListas(LinkedList[] list) {
        for (int i = 0; i < Vertices; i++) {
            list[i] = new LinkedList();
        }
    }

    static void print(LinkedList[] list) {
        for (int i = 0; i < Vertices; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print(list[i].get(j));
            }
            System.out.println();
        }
    }

}