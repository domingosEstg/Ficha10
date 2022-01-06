package com.company;

public interface ICarrinho
{
    /** Acrescenta um ProdutoPesado ao carrinho... */
    void acrescentarProdutoPeso(Produto prod, float peso);

    /** Acrescenta um ProdutoEmbalado ao carrinho... */
    void acrescentarProdEmbalagem(Produto prod, float numEmbalagens) throws IllegalArgumentException;

    /** Totaliza o carrinho (Euros) */
    float getValorAPagar();
}
