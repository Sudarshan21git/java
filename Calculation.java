 import javax.swing.*;
import java.awt.event.*;
public class Calculation implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    
    public Calculation()
    {
        f=new JFrame("calculation");
        l1=new JLabel("length:");
        l2=new JLabel("width:");
        l3=new JLabel();
        t1=new JTextField(25);
        t2=new JTextField(25);
        b1=new JButton("AREA");
        b2=new JButton("perimter");
        f.add(l1);
        f.add(l2);
        f.add(l3); 
        f.add(t1);
        f.add(t2);
        f.add(b1);
      
        f.add(b2);
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        
        l1.setBounds(20, 20, 100, 20);
        t1.setBounds(120, 20, 100, 20);
        l2.setBounds(20, 50, 100, 20);
        t2.setBounds(120, 50, 100, 20);
       
        b1.setBounds(120, 80, 100, 20);
        l3.setBounds(20, 110, 100, 20);
        b2.setBounds(200,80,100,20);

        b1.addActionListener(this);
        b2.addActionListener(this);
       
    }
    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        if(e.getActionCommand()=="AREA")
        {
             int a=n1*n2;
              l3.setText(" area="+a); 
        }
        if(e.getActionCommand()=="perimter")
        {
             int  p= 2*(n1*n2);
              l3.setText(" PERIMETER="+p); 
        }
      
    }

    

    public static void main(String[] args)
    {
        new Calculation();
    }
}
