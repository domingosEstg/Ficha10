package com.company;

public class LinhaStock {

    private float quantidadeExistente;
    private float precoDeVenda;
    private Supermercado supermercado;
    private Produto produto;

    public LinhaStock(float quantidadeExistente, float precoDeVenda, Supermercado supermercado, Produto produto) {
        this.quantidadeExistente = quantidadeExistente;
        this.precoDeVenda = precoDeVenda;
        this.supermercado = supermercado;
        this.produto = produto;
    }

    public float getQuantidadeExistente() {
        return quantidadeExistente;
    }

    public void setQuantidadeExistente(float quantidadeExistente) {
        this.quantidadeExistente = quantidadeExistente;
    }

    public float getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(float precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
