package br.com.igor.calc.Modelo;

@FunctionalInterface
public interface MemoriaObservador {
    
    public void ValorAlterado(String novoValor);
}
