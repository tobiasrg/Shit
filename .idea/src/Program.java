import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program extends JFrame implements ActionListener {
    JTextField field;
    JLabel message;

    Program() {
        setLayout(new BorderLayout());
        JPanel north = new JPanel();
        north.add(new JTextField(10));
        north.add(new JButton("11111111"));
        add(north, BorderLayout.NORTH);

        JPanel center = new JPanel();
        center.add (new JScrollPane(new JTextArea()));
        add(center, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        Program p1 = new Program();
    }
}
