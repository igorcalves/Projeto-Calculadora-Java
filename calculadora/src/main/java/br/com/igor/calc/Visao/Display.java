package br.com.igor.calc.Visao;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel {

    private final JLabel label;

    public Display() {
        setBackground(new Color(46, 49, 50));
        label = new JLabel("1234,56");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);

    }
}
