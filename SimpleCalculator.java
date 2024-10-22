import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    // Declare components
    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton addButton, subButton, mulButton, divButton, equalButton, clearButton;
    private double num1, num2, result;
    private char operator;

    public SimpleCalculator() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Input field
        inputField = new JTextField();
        inputField.setBounds(30, 40, 340, 50);
        inputField.setFont(new Font("Arial", Font.PLAIN, 24));
        inputField.setEditable(false);
        add(inputField);

        // Create number buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 24));
            numberButtons[i].addActionListener(this);
        }

        // Set button positions
        int x = 30, y = 100;
        for (int i = 1; i <= 9; i++) {
            numberButtons[i].setBounds(x, y, 80, 80);
            x += 90;
            if (i % 3 == 0) {
                x = 30;
                y += 90;
            }
        }
        numberButtons[0].setBounds(30, y, 80, 80);
        add(numberButtons[0]);

        // Create operation buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equalButton = new JButton("=");
        clearButton = new JButton("C");

        JButton[] operationButtons = {addButton, subButton, mulButton, divButton, equalButton, clearButton};

        // Set button properties and positions
        for (JButton button : operationButtons) {
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(this);
        }

        addButton.setBounds(270, 100, 80, 80);
        subButton.setBounds(270, 190, 80, 80);
        mulButton.setBounds(270, 280, 80, 80);
        divButton.setBounds(270, 370, 80, 80);
        equalButton.setBounds(30, 460, 80, 80);
        clearButton.setBounds(150, 460, 80, 80);

        // Add operation buttons to frame
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(equalButton);
        add(clearButton);

        // Make the frame visible
        setVisible(true);
    }

    // Action listener method
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < numberButtons.length; i++) {
            if (e.getSource() == numberButtons[i]) {
                inputField.setText(inputField.getText() + i);
            }
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '+';
            inputField.setText("");
        } else if (e.getSource() == subButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '-';
            inputField.setText("");
        } else if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '*';
            inputField.setText("");
        } else if (e.getSource() == divButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '/';
            inputField.setText("");
        } else if (e.getSource() == equalButton) {
            num2 = Double.parseDouble(inputField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            inputField.setText(String.valueOf(result));
        } else if (e.getSource() == clearButton) {
            inputField.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculator::new);
    }
}
