import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class StatusDemo extends Applet implements MouseListener {

    public void init() {
        addMouseListener(this);
    }

    public void mouseEntered(MouseEvent e) {
        showStatus("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        showStatus("Mouse Exited");
    }

    public void mouseClicked(MouseEvent e) {
        showStatus("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}