package com.company;

import java.util.HashMap;

public class CarrinhodeCompra implements ICarrinho{

    private Supermercado supermercado;
    private HashMap<Produto,Float> quantidadeProduto;


    public CarrinhodeCompra(Supermercado supermercado) {
        this.supermercado = supermercado;
        quantidadeProduto = new HashMap<>();
    }

    public void acrescentarProduto(Produto produto,float quantidade) throws  IllegalArgumentException{
        if(!supermercado.getProdutosSock().containsKey(produto)) throw new IllegalArgumentException();
        quantidadeProduto.put(produto,quantidade);
    }

    @Override
    public void acrescentarProdutoPeso(Produto prod, float peso) throws  IllegalArgumentException{
        acrescentarProduto(prod,peso);
    }

    @Override
    public void acrescentarProdEmbalagem(Produto prod, float numEmbalagens) throws  IllegalArgumentException{
        acrescentarProduto(prod,numEmbalagens);
    }

    @Override
    public float getValorAPagar() {
        float total = 0;

        for(Produto produto : quantidadeProduto.keySet()){
            total += quantidadeProduto.get(produto) * produto.getPrecoDeVenca();
        }

        return total;
    }
}
