import javax.swing.*;
import java.awt.event.*;

public class PasswordExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JPasswordField p = new JPasswordField();
        p.setBounds(100, 100, 150, 30);

        p.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] pass = p.getPassword();
                System.out.println("Password: " + new String(pass));
            }
        });

        f.add(p);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}