import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name;
        String message;

        name = JOptionPane.showInputDialog("Vad heter du?");
        message = "håll käften " + name;
        JOptionPane.showMessageDialog(null, message);

        System.out.println("Hello World från laptop");
    }
}
