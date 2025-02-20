// 672115045 Virawit Kongthong OOP Lab10

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class simpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        // creating menubars
        JMenuBar menuBar = new JMenuBar();
        JMenu calculator = new JMenu("Mode");

        JPanel cardPanel = new JPanel(new CardLayout());

        // creating different types of panels
        JPanel normalCard = new JPanel();
        normalCard.add(new JLabel("Normal Calculator"));

        JPanel sciCard = new JPanel();
        sciCard.add(new JLabel("Scientific Calculator"));

        cardPanel.add(normalCard, "Normal");
        cardPanel.add(sciCard, "Scientific");


        // menus
        JMenuItem normalMenuItem = new JMenuItem("Normal");
        normalMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) cardPanel.getLayout();
                layout.show(cardPanel, "Normal");
            }
        });

        JMenuItem sciMenuItem = new JMenuItem("Scientific");
        sciMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) cardPanel.getLayout();
                layout.show(cardPanel, "Scientific");
            }
        });

        //panel for normal calculator
        JPanel normalCalculatorPanel = new JPanel();
        normalCalculatorPanel.setLayout(new GridLayout(6,2));

        JLabel num1Label = new JLabel("Enter first number:");
        JTextField num1Field = new JTextField();

        JLabel num2Label = new JLabel("Enter second number:");
        JTextField num2Field = new JTextField();

        JButton addition = new JButton("Addition");
        JButton subtraction = new JButton("Subtraction");
        JButton multiplication = new JButton("Multiplication");
        JButton division = new JButton("Division");

        JLabel result = new JLabel("Result");

        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultf = Double.toString(Double.valueOf(num1Field.getText()) + Double.valueOf(num2Field.getText()));
                result.setText(resultf);
            }
        });
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultf = Double.toString(Double.valueOf(num1Field.getText()) - Double.valueOf(num2Field.getText()));
                result.setText(resultf);
            }
        });

        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultf = Double.toString(Double.valueOf(num1Field.getText()) * Double.valueOf(num2Field.getText()));
                result.setText(resultf);
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultf = Double.toString(Double.valueOf(num1Field.getText()) / Double.valueOf(num2Field.getText()));
                result.setText(resultf);
            }
        });

        normalCalculatorPanel.add(num1Label);
        normalCalculatorPanel.add(num1Field);
        normalCalculatorPanel.add(num2Label);
        normalCalculatorPanel.add(num2Field);
        normalCalculatorPanel.add(addition);
        normalCalculatorPanel.add(subtraction);
        normalCalculatorPanel.add(multiplication);
        normalCalculatorPanel.add(division);
        normalCalculatorPanel.add(result);

        //panel for sci cal
        JPanel sciCalculatorPanel = new JPanel();
        sciCalculatorPanel.setLayout(new GridLayout(4,2));

        JLabel numLabel = new JLabel("Enter number");
        JTextField numField = new JTextField();

        JButton sin = new JButton("Sin");
        JButton cos = new JButton("Cos");
        JButton tan = new JButton("Tan");
        JButton log = new JButton("Log");

        JLabel sciResult = new JLabel();

        sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = Double.toString(Math.sin(Math.toRadians(Double.valueOf(numField.getText()))));
                sciResult.setText(result);
            }
        });

        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = Double.toString(Math.cos(Math.toRadians(Double.valueOf(numField.getText()))));
                sciResult.setText(result);
            }
        });

        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = Double.toString(Math.tan(Math.toRadians(Double.valueOf(numField.getText()))));
                sciResult.setText(result);
            }
        });

        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = Double.toString(Math.log(Math.toRadians(Double.valueOf(numField.getText()))));
                sciResult.setText(result);
            }
        });

        sciCalculatorPanel.add(numLabel);
        sciCalculatorPanel.add(numField);
        sciCalculatorPanel.add(sin);
        sciCalculatorPanel.add(cos);
        sciCalculatorPanel.add(tan);
        sciCalculatorPanel.add(log);
        sciCalculatorPanel.add(sciResult);

        calculator.add(normalMenuItem);
        calculator.add(sciMenuItem);

        menuBar.add(calculator);

        frame.setJMenuBar(menuBar);

        cardPanel.add(normalCalculatorPanel, "Normal");
        cardPanel.add(sciCalculatorPanel, "Scientific");

        CardLayout layout = (CardLayout) cardPanel.getLayout();
        layout.show(cardPanel, "Normal"); 

        frame.add(cardPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
