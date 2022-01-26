package one.digitalinnovation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Patrícia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Pâmela");
        filaDeBanco.add("Anderson");

        System.out.println(filaDeBanco);

        String clienteASerAtendido = filaDeBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaDeBanco);

        String primeiroDaFila = filaDeBanco.peek();

        System.out.println(primeiroDaFila);
        System.out.println(filaDeBanco);

        String primeiroClienteOuErro = filaDeBanco.element();
        System.out.println(primeiroClienteOuErro);

        for (String cliente : filaDeBanco) {
            System.out.println(cliente);
        }

        Iterator<String> client = filaDeBanco.iterator();
        while (client.hasNext()){
            System.out.println("---> " + client.next());
        }
    }
}
