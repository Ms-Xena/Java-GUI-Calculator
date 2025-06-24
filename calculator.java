import java.awt.event.*;
import javax.swing.*;

class calculatorWindow extends JFrame{

JTextField t1, t2, t3;
calculatorWindow(){

setLayout(null); setSize(500,300); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

t1 = new JTextField(); t1.setBounds(100,30,250,40);
t2 = new JTextField(); t2.setBounds(100,80,250,40);
t3 = new JTextField(); t3.setBounds(100,130,250,40); t3.setEditable(false);

JButton b1 = new JButton("Add"); b1.setBounds(100,180,60,40);
JButton b2 = new JButton("SUb"); b2.setBounds(165,180,60,40);
JButton b3 = new JButton("Mul"); b3.setBounds(230,180,60,40);
JButton b4 = new JButton("Div"); b4.setBounds(295,180,60,40);

eventHandler ev = new eventHandler();
b1.addActionListener(ev);
b2.addActionListener(ev);
b3.addActionListener(ev);
b4.addActionListener(ev);

add(t1); add(t2); add(t3); 
add(b1); add(b2); add(b3); add(b4);


setVisible(true);
}

class eventHandler implements ActionListener{

public void actionPerformed(ActionEvent ae){
int val1 = Integer.parseInt(t1.getText());
int val2 = Integer.parseInt(t2.getText());

if ( ((JButton)ae.getSource()).getText().equalsIgnoreCase("Add") )
t3.setText("Addition: "+ (val1+val2));



if ( ((JButton)ae.getSource()).getText().equalsIgnoreCase("Sub") )
t3.setText("Subtraction: "+ (val1-val2));



if ( ((JButton)ae.getSource()).getText().equalsIgnoreCase("Mul") )
t3.setText("Multiplication: "+ (val1*val2));



if ( ((JButton)ae.getSource()).getText().equalsIgnoreCase("div") )
t3.setText("Division: "+ (val1/val2));
}

}
}

public class calculator{
public static void main(String[] args){
new calculatorWindow();
}
}