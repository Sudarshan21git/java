import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Comp extends JFrame implements ActionListener{

    JLabel l1;
    JLabel l2;
    JLabel l3;

    JTextField t1;
    JTextField t2;
    

    JButton B;
    public  Comp() {
        l1 = new JLabel("num1");
        l2 = new JLabel("num2");
        l3 = new JLabel("");
    
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        
        
        B = new JButton("Find max");
        setVisible(true);
        setTitle("comparsion");
        setDefaultCloseOperation(3);
        add(l1);add(l2);add(l3);
        add(t1);add(t2);
        add(B);
        setLayout(null);
        setSize(500,300);
        l1.setBounds(20,20,200,20);
        l2.setBounds(20,50,200,20);
        l3.setBounds(20,90,200,20);
        t1.setBounds(240,20,200,20);
        t2.setBounds(240,60,200,20);
        
        B.setBounds(260,130,160,20);
    
        B.addActionListener (this);
    }
public void actionPerformed(ActionEvent e){
    int n1=Integer.parseInt(t1.getText());
    int n2=Integer.parseInt(t2.getText());
if(n1>n2){
    l3.setText("n1 is max number="+n1);
}else
{
    l3.setText("n2 is max number ="+n2);
}
}

    public static void main(String[] args) {
        new Comp();
    }
}