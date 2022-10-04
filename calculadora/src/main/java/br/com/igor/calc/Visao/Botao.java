package br.com.igor.calc.Visao;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("courier", Font.PLAIN, 25));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

}
