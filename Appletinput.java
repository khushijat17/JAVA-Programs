import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Appletinput extends Applet implements ActionListener{
TextField t1 = new TextField(2);
TextField t2 = new TextField(2);
TextField t3 = new TextField(2);
Label l1 = new Label("FIRST NUMBER:");
Label l2 = new Label("SECOND NUMBER:");
Label l3 = new Label("SUM:");
Button b = new Button("ADD");
public void init(){
add(t1);
add(t2);
add(t3);
add(l1);
add(l2);
add(l3);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e){

if(e.getSource()==b){
int n1 = Integer.parseInt(t1.getText());
int n2= Integer.parseInt(t2.getText());
t3.setText(" " + (n1+n2));
}
}
}




