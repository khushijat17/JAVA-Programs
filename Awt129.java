//129. Create an application to draw a horizontal line.
import java.awt.*;
class Awt129 extends Frame{
public void paint(Graphics g){
g.drawLine(50,300,100,300);
}
public static void main(String args[]){
Awt129 a = new Awt129();
a.setSize(300,300);
a.setVisible(true);
}
}