package org.example;

public class PrecificacaoERP {

    public static String formula = "custo * 2 + frete";

    public static double calcularPrecoVenda(double custo, double frete) {
        String expressao;
        expressao = formula.replace("custo", Double.toString(custo));
        expressao = expressao.replace("frete", Double.toString(frete));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}