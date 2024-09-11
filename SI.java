import javax.swing.*;
import java.awt.event.*;
public class SI extends JFrame implements ActionListener {
    JLabel roll,name,college,gender,hobbies,program;
    JTextArea print;
    JTextField rfield,nfield,cfield;
    JRadioButton gm,gf;
    JCheckBox pcb,rcb,scb;
    JComboBox dd;
    JButton b;
    public SI(){
        roll= new JLabel("Roll:");
        name= new JLabel("Name:");
        college= new JLabel("College:");
        gender= new JLabel("Gender:");
        hobbies= new JLabel("Hobbies:");
        program= new JLabel("Program:");
        rfield = new JTextField(30);
        nfield = new JTextField(30);
        cfield = new JTextField(30);
        print= new JTextArea();
        gm = new JRadioButton("Male");
        gf = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(gm);bg.add(gf);
        pcb = new JCheckBox("playing");
        rcb = new JCheckBox("reading");
        scb = new JCheckBox("swimming");
        b = new JButton("Save");
        String list[]={"BCA","Bsc.csit","BIT"};
        dd= new JComboBox (list);
        setSize(550, 350);
        setVisible(true);
        setTitle("Students Information");
        setDefaultCloseOperation(3);
        add(roll);add(name);add(college);add(gender);add(hobbies);add(program);add(gm);add(gf);add(pcb);add(rcb);add(scb);add(rfield);add(nfield);add(cfield);add(dd);add(b);add(print);
        setLayout(null);
        roll.setBounds(20,20,50,20);
        name.setBounds(20,60,50,20);
        college.setBounds(20,100,50,20);
        gender.setBounds(20,140,50,20);
        hobbies.setBounds(20,180,50,20);
        program.setBounds(20,220,50,20);
        rfield.setBounds(120,20,150,20);
        nfield.setBounds(120,60,150,20);
        cfield.setBounds(120,100,150,20);
        gm.setBounds(120,140,100,20);
        gf.setBounds(220,140,100,20);
        pcb.setBounds(120,180,100,20);
        rcb.setBounds(220,180,100,20);
        scb.setBounds(320,180,100,20);
        dd.setBounds(120,220,150,20);
        b.setBounds(20,280,100,20);
        print.setBounds(320,20,200,150);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
    String r=rfield.getText();
    String n=nfield.getText();
    String c=cfield.getText();
    print.setText("Roll="+r +  System.lineSeparator() +"Name="+n +  System.lineSeparator() + "College=" + c);
    }
public static void main(String[] args) {
    new SI();
}
}