import java.awt.*;

class LineDemo extends Frame {
    public void paint(Graphics g) {
        g.drawLine(50, 100, 250, 100); // horizontal line
    }

    public static void main(String[] args) {
        LineDemo f = new LineDemo();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}