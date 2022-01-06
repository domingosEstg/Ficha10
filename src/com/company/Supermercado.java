package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Supermercado {

    private Integer codigo;
    private String nome;
    private HashMap<Produto, Float> produtosSock;

    public Supermercado(Integer codigo, String nome, HashMap<Produto, Float> produtosSock) {
        this.codigo = codigo;
        this.nome = nome;
        this.produtosSock = produtosSock;
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

    public HashMap<Produto, Float> getProdutosSock() {
        return produtosSock;
    }

    public void setProdutosSock(HashMap<Produto, Float> produtosSock) {
        this.produtosSock = produtosSock;
    }

    public void acrecentarStock(Produto produto, float qtdAdicionada){
        if(!produtosSock.containsKey(produto)){
            produtosSock.put(produto,qtdAdicionada);
        }else{
            produtosSock.put(produto, produtosSock.get(produto) + qtdAdicionada);
        }

        //produtosSock.put(produto, (produtosSock.get(produto) != null ? (produtosSock.get(produto) + qtdAdicionada) : qtdAdicionada));
        //List<Produto> keys = produtosSock.keySet().stream().toList();
    }

    public float valorTotalStock(){
        float totalStock = 0;
        for(Produto produto : produtosSock.keySet()){
            totalStock += produtosSock.get(produto) * produto.getPrecoDeVenca();
        }
        return  totalStock;
    }
}
