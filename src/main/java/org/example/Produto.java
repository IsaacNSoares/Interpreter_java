package org.example;

public class Produto {
    private double custo;
    private double frete;

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double calcularPrecoVenda() {
        return PrecificacaoERP.calcularPrecoVenda(this.custo, this.frete);
    }
}