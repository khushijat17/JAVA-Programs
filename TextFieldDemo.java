import javax.swing.*;
import java.awt.event.*;

public class TextFieldDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextField Example");

        JTextField t = new JTextField();
        t.setBounds(100, 100, 150, 30);

        t.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("You entered: " + t.getText());
            }
        });

        f.add(t);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}