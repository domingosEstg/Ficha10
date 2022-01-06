package com.company;

import java.util.HashMap;

public class Produto {

    private Integer codigo;
    private String nome;
    private HashMap<Supermercado,Integer> supermercadoStock;
    private float precoDeVenca;


    public Produto(Integer codigo, String nome, float precoDeVenca) {
        this.codigo = codigo;
        this.nome = nome;
        this.supermercadoStock = new HashMap<>();
        this.precoDeVenca = precoDeVenca;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashMap<Supermercado, Integer> getSupermercadoStock() {
        return supermercadoStock;
    }

    public void setSupermercadoStock(HashMap<Supermercado, Integer> supermercadoStock) {
        this.supermercadoStock = supermercadoStock;
    }

    public float getPrecoDeVenca() {
        return precoDeVenca;
    }

    public void setPrecoDeVenca(float precoDeVenca) {
        this.precoDeVenca = precoDeVenca;
    }
}
