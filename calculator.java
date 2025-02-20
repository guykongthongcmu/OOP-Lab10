// 672115045 Virawit Kongthong OOP Lab10


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel num1Label = new JLabel("Enter first number:");
        JTextField num1Field = new JTextField();

        JLabel num2Label = new JLabel("Enter second number:");
        JTextField num2Field = new JTextField();

        JButton addition = new JButton("Addition");
        JButton subtraction = new JButton("Subtraction");

        JLabel result = new JLabel("Result");

        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(addition);
        panel.add(subtraction);
        panel.add(result);

        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultf = Integer.toString(Integer.parseInt(num1Field.getText()) + Integer.parseInt(num2Field.getText()));
                result.setText(resultf);
            }
        });
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultf = Integer.toString(Integer.parseInt(num1Field.getText()) - Integer.parseInt(num2Field.getText()));
                result.setText(resultf);
            }
        });
        frame.add(panel);

        frame.setVisible(true);
    }
}
