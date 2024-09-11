import javax.swing.*;
public class Main extends JFrame{
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JButton B;
    public  Main() {
        l1 = new JLabel("Principal");
        l2 = new JLabel("Rate:");
        l3 = new JLabel("Time:");
        l4 = new JLabel("Simple Interest:");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);
        B = new JButton("Calculate");
        setVisible(true);
        setTitle("Interest Calculator");
        setDefaultCloseOperation(3);
        add(l1);add(l2);add(l3);add(l4);
        add(t1);add(t2);add(t3);add(t4);
        add(B);
        setLayout(null);
        setSize(500,300);
        l1.setBounds(20,20,200,20);
        l2.setBounds(20,50,200,20);
        l3.setBounds(20,90,200,20);
        t1.setBounds(240,20,200,20);
        t2.setBounds(240,60,200,20);
        t3.setBounds(240,90,200,20);
        B.setBounds(260,130,160,20);
        l4.setBounds(20,170,200,20);
        t4.setBounds(240,170,200,20);
    }

    public static void main(String[] args) {
        new Main();
    }
}