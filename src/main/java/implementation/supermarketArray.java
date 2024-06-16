package implementation;

import java.sql.SQLOutput;

public class supermarketArray implements supermarket {

    //Dados e tipos de dados.
    private final String[] items;

    private int lastIndex;

    //construtor ( Vetor )
    public supermarketArray(final int size) {
        items = new String[size];
        lastIndex = -1;

    }


    //Metodos implementados da interface.
    @Override
    public void add(final String item) {
        if (lastIndex == items.length - 1) {
            System.err.println("Lista de Supermercado cheia");
        } else {
            lastIndex++;
            items[lastIndex] = item;

        }

    }

    @Override
    public void print() {
        System.out.println("##########");
        if (lastIndex < 0) {
            System.out.println("Lista de Supermercado vazia");
        }
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + "-" + items[i]);
        }

        System.out.println("################");

    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.out.println("Indice invalido: " + index);
        }

    }
//operação shift, puxar elementos da direita para esquerda!

    private void shift(int index) {
        for (int i = index; i < lastIndex; i++){

            items[i] = items[i + 1];
        }
    }
}