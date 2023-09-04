package Programs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame implements ActionListener {
    private JTextField displayField;
    private String currentInput;
    private double result;
    private String operator;

    public CalculatorApp() {
        setTitle("Calculator");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        currentInput = "";
        result = 0;
        operator = "";

        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        displayField = new JTextField(10);
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.PLAIN, 20));
        mainPanel.add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
 
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9.]")) {
            currentInput += command;
            displayField.setText(currentInput);
        } else if (command.equals("=")) {
            calculateResult();
        } else {
            operator = command;
            result = Double.parseDouble(currentInput);
            currentInput = "";
        }
    }

    private void calculateResult() {
        double inputNumber = Double.parseDouble(currentInput);

        switch (operator) {
            case "+":
                result += inputNumber;
                break;
            case "-":
                result -= inputNumber;
                break;
            case "*":
                result *= inputNumber;
                break;
            case "/":
                result /= inputNumber;
                break;
        }

        displayField.setText(String.valueOf(result));
        currentInput = "";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorApp calculator = new CalculatorApp();
            calculator.setVisible(true);
        });
    }
}
