package br.com.igor.calc.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
    private static final Memoria intancia = new Memoria();

    private final List<MemoriaObservador> observadores = new ArrayList<>();

    private String textoAtual = "";

    public Memoria() {
    }

    public static Memoria getIntancia() {
        return intancia;
    }

    public void adicionarObservador(MemoriaObservador observador) {
        observadores.add(observador);

    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String valor) {
        if ("AC".equals(valor)) {
            textoAtual = "";
        } else {

            textoAtual += valor;
        }

        observadores.forEach(o -> o.ValorAlterado(getTextoAtual()));
    }

}
