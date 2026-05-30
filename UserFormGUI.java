import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class UserFormGUI extends JFrame {

    public UserFormGUI() {

        // ✅ Nimbus Look (modern feel)
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {}

        setTitle("User Information Form");
        setSize(1000, 650);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(210, 225, 245));

        // 🔷 LEFT PANEL
        JPanel left = new JPanel();
        left.setLayout(null);
        left.setBounds(20, 60, 450, 520);
        left.setBackground(new Color(225, 235, 250));
        left.setBorder(new TitledBorder("Enter Information"));
        add(left);

        Font f = new Font("Arial", Font.PLAIN, 14);

        addField(left, "First Name:", 30);
        addField(left, "Last Name:", 80);
        addField(left, "Email:", 130);
        addField(left, "Phone:", 180);
        addField(left, "Date of Birth:", 230);

        // Gender
        JLabel g = new JLabel("Gender:");
        g.setBounds(20, 280, 100, 25);
        left.add(g);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        male.setBounds(130, 280, 80, 25);
        female.setBounds(210, 280, 100, 25);

        left.add(male);
        left.add(female);

        // Address
        JLabel add = new JLabel("Address:");
        add.setBounds(20, 320, 100, 25);
        left.add(add);

        JTextArea area = new JTextArea();
        area.setBounds(130, 320, 250, 60);
        area.setBorder(new LineBorder(Color.GRAY));
        left.add(area);

        // City
        JLabel city = new JLabel("City:");
        city.setBounds(20, 400, 100, 25);
        left.add(city);

        JComboBox box = new JComboBox(new String[]{"Select City", "Indore", "Bhopal", "Delhi"});
        box.setBounds(130, 400, 200, 30);
        left.add(box);

        // Hobbies
        JCheckBox c1 = new JCheckBox("Reading");
        JCheckBox c2 = new JCheckBox("Traveling");
        JCheckBox c3 = new JCheckBox("Music");
        JCheckBox c4 = new JCheckBox("Sports");

        c1.setBounds(130, 440, 100, 25);
        c2.setBounds(230, 440, 100, 25);
        c3.setBounds(130, 470, 100, 25);
        c4.setBounds(230, 470, 100, 25);

        left.add(c1);
        left.add(c2);
        left.add(c3);
        left.add(c4);

        // Buttons
        JButton submit = new JButton("Submit");
        submit.setBounds(130, 500, 120, 35);
        submit.setBackground(new Color(40, 90, 180));
        submit.setForeground(Color.WHITE);
        left.add(submit);

        JButton clear = new JButton("Clear");
        clear.setBounds(260, 500, 120, 35);
        clear.setBackground(new Color(255, 140, 0));
        clear.setForeground(Color.WHITE);
        left.add(clear);

        // 🔷 RIGHT PANEL
        JPanel right = new JPanel();
        right.setLayout(null);
        right.setBounds(500, 60, 450, 520);
        right.setBackground(new Color(235, 240, 230));
        right.setBorder(new TitledBorder("Retrieve Information"));
        add(right);

        JLabel id = new JLabel("Enter User ID:");
        id.setBounds(20, 30, 120, 25);
        right.add(id);

        JTextField txt = new JTextField();
        txt.setBounds(150, 30, 150, 30);
        right.add(txt);

        JButton fetch = new JButton("Fetch Data");
        fetch.setBounds(310, 30, 120, 30);
        fetch.setBackground(new Color(50, 120, 200));
        fetch.setForeground(Color.WHITE);
        right.add(fetch);

        // Table
        String[] cols = {"User ID", "Name", "Email", "Phone", "City", "Hobbies"};
        JTable table = new JTable(new DefaultTableModel(cols, 0));

        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20, 100, 410, 350);
        right.add(sp);

        setVisible(true);
    }

    void addField(JPanel p, String text, int y) {
        JLabel l = new JLabel(text);
        l.setBounds(20, y, 120, 25);
        p.add(l);

        JTextField t = new JTextField();
        t.setBounds(130, y, 250, 30);
        p.add(t);
    }

    public static void main(String[] args) {
        new UserFormGUI();
    }
}