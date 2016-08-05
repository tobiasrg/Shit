import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program extends JFrame {
    JTextField field;
    JLabel message;

    Program() {
        setLayout(new FlowLayout());
        JLabel message = new JLabel("Käften");
        add(message);
        field = new JTextField(30);
        add(field);
        JButton button = new JButton("suckadick");
        add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);


    }


    public static void main(String[] args) {
        Program p1 = new Program();
    }
}
