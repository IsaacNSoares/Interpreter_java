package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Produto produto = new Produto();
        produto.setCusto(50.0);
        produto.setFrete(15.0);

        assertEquals(115.0, produto.calcularPrecoVenda());
    }

}