package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Produto produto1 = new Produto(1221, "Produto1", 20);

        CarrinhodeCompra carrinhodeCompra = new CarrinhodeCompra(new Supermercado(123123, "Supermecado1", new HashMap<>()));

        try {
            carrinhodeCompra.acrescentarProdEmbalagem(produto1, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("O produto nao existe no supermecado");
        }
    }
}
