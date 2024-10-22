import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyInfoWindow extends JFrame {
    private JTextField nameField;
    private JTextField streetField;
    private JTextField cityField;
    private JTextField pincodeField;
    private JButton myInfoButton;
    private JLabel outputLabel;

    public MyInfoWindow() {
        // Create frame
        setTitle("My Info Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2)); // 5 rows, 2 columns

        // Create and add components
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Street:"));
        streetField = new JTextField();
        add(streetField);

        add(new JLabel("City:"));
        cityField = new JTextField();
        add(cityField);

        add(new JLabel("Pincode:"));
        pincodeField = new JTextField();
        add(pincodeField);

        myInfoButton = new JButton("MyInfo");
        add(myInfoButton);

        outputLabel = new JLabel();
        outputLabel.setFont(new Font("Arial", Font.ITALIC, 32)); // Set font
        add(outputLabel);

        // Button action
        myInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String street = streetField.getText();
                String city = cityField.getText();
                String pincode = pincodeField.getText();

                String details = String.format("<html>Name: %s<br>Street: %s<br>City: %s<br>Pincode: %s</html>",
                                                name, street, city, pincode);
                outputLabel.setText(details);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyInfoWindow();
            }
        });
    }
}
