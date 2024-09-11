import javax.swing.*;
import java.awt.event.*;

public class Cal implements ActionListener{
    JFrame f;
    JLabel l1,  l3;
    JTextField t;
    JButton b1, b2;

    public Cal() {
        f = new JFrame("Calculation");
        l1 = new JLabel("Enter number:");
        
        l3 = new JLabel();
        t = new JTextField(null, null, 25);
        b1 = new JButton("cube");
        b2 = new JButton("fact");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        l1.setBounds(20, 50, 100, 20);
        t.setBounds(20, 100, 100, 20);
        b1.setBounds(20, 150, 100, 20);
        b2.setBounds(100, 150, 100, 20);
    
        l3.setBounds(60, 200, 100, 20);
        f.add(l1);

        f.add(l3);
        f.add(t);
        f.add(b1);
        f.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

        public void actionPerformed(ActionEvent e)
    {
        int n=Integer.parseInt(t.getText());
    
        if(e.getActionCommand()=="cube")
        {
             int a=n*n*n;
              l3.setText(" area="+a); 
        }
        if(e.getActionCommand()=="fact")
        {
            int fact = n;
            for (int i = 1; i < n; i++) {
                fact = fact * (n - i);
            }
            l3.setText("fact = " + fact);
        } 
        }
      
    
  
    public static void main(String args[]) {
        new Cal();
    }
}
