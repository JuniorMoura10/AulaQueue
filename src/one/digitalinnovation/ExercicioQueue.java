package one.digitalinnovation;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {

        //Criando a Queue de nomes
        Queue<String> nomes = new LinkedList<>();

        //Adicionando elementos a Queue
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navegando na Queue exibindo cada nome no console
        for (String pessoas : nomes) {
            System.out.println(pessoas);
        }

        System.out.println("\t\n----------------------\t\n");

        //Retorne o primeiro item da fila, sem removê-lo
        String primeiroSemRemover = nomes.peek();
        System.out.println(primeiroSemRemover);
        System.out.println(nomes);

        System.out.println("\t\n----------------------\t\n");

        //Retorne o primeiro item da fila, removendo o mesmo
        String removePrimeiro = nomes.poll();
        System.out.println(removePrimeiro);
        System.out.println(nomes);
        System.out.println("\t\n----------------------\t\n");

        //Adicione um novo nome ("Daniel"). Verifique a posição que o mesmo assumiu na fila
        nomes.add("Daniel");
        System.out.println(nomes);
        System.out.println("\t\n----------------------\t\n");

        //Retorne o tamanho da fila
        System.out.println(nomes.size());
        System.out.println(nomes);
        System.out.println("\t\n----------------------\t\n");

        //Verifique se a lista está vazia
        boolean estaVazia = nomes.isEmpty();
        System.out.println(estaVazia);
        System.out.println("\t\n----------------------\t\n");

        //Verifique se o nome Carlos está na lista
        boolean contemCarlos = nomes.contains("Carlos");
        System.out.println(contemCarlos);
        System.out.println(nomes);

    }
}
