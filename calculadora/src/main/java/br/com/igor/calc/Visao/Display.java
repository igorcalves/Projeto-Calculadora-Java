package br.com.igor.calc.Visao;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.igor.calc.Modelo.Memoria;
import br.com.igor.calc.Modelo.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display() {
        Memoria.getIntancia().adicionarObservador(this);

        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getIntancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);

    }

    @Override
    public void ValorAlterado(String novoValor) {
        label.setText(novoValor);
        
    }

    
}
