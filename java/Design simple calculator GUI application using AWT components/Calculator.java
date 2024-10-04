import java.awt.*;
import java.awt.event.*;

public class Calculator {
    // Frame for the application
    private Frame frame;

    // Components for the calculator
    private TextField inputField;
    private Button[] numberButtons;
    private Button addButton, subButton, mulButton, divButton, equalButton, clearButton;
    private String operator;
    private double firstOperand;

    public Calculator() {
        // Initialize the frame
        frame = new Frame("Simple Calculator");
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        // Input field
        inputField = new TextField();
        inputField.setEditable(false);
        frame.add(inputField, BorderLayout.NORTH);

        // Panel for number buttons
        Panel numberPanel = new Panel();
        numberPanel.setLayout(new GridLayout(4, 3));

        // Create number buttons
        numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            int finalI = i;
            numberButtons[i].addActionListener(e -> inputField.setText(inputField.getText() + finalI));
            numberPanel.add(numberButtons[i]);
        }

        // Add buttons to the panel
        frame.add(numberPanel, BorderLayout.CENTER);

        // Panel for operator buttons
        Panel operatorPanel = new Panel();
        operatorPanel.setLayout(new GridLayout(5, 1));

        // Create operator buttons
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        equalButton = new Button("=");
        clearButton = new Button("C");

        // Add action listeners for operator buttons
        addButton.addActionListener(e -> handleOperator("+"));
        subButton.addActionListener(e -> handleOperator("-"));
        mulButton.addActionListener(e -> handleOperator("*"));
        divButton.addActionListener(e -> handleOperator("/"));
        equalButton.addActionListener(e -> calculateResult());
        clearButton.addActionListener(e -> clear());

        // Add operator buttons to the panel
        operatorPanel.add(addButton);
        operatorPanel.add(subButton);
        operatorPanel.add(mulButton);
        operatorPanel.add(divButton);
        operatorPanel.add(equalButton);
        operatorPanel.add(clearButton);

        // Add operator panel to the frame
        frame.add(operatorPanel, BorderLayout.EAST);

        // Add window listener for closing the application
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose(); // Close the frame
            }
        });

        // Set the frame visibility
        frame.setVisible(true);
    }

    private void handleOperator(String op) {
        firstOperand = Double.parseDouble(inputField.getText());
        operator = op;
        inputField.setText(""); // Clear the input field for next number
    }

    private void calculateResult() {
        double secondOperand = Double.parseDouble(inputField.getText());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    inputField.setText("Error"); // Handle division by zero
                    return;
                }
                break;
        }

        inputField.setText(String.valueOf(result));
    }

    private void clear() {
        inputField.setText("");
        operator = "";
        firstOperand = 0;
    }

    public static void main(String[] args) {
        // Run the application
        new Calculator();
    }
}
