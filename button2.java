import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class button2 extends JFrame implements ActionListener{
    JTextField j1,j2,j3;
    JLabel l1,l2;
    JButton a,s;
    button2(){
        j1=new JTextField(20);
        j2=new JTextField(20);
        j3=new JTextField(20);
        l1=new JLabel("Enter a first number");
        l2=new JLabel("Enter a second number");
        Button a=new Button("SUb");
        Button s=new Button("Add");
        add(l1);
        add(j1);
        add(l2);
        add(j2);
        add(a);
        add(s);
        add(j3);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.addActionListener(this);
        s.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        int n1=Integer.parseInt(j1.getText());
        int n2=Integer.parseInt(j2.getText());
        if(ae.getSource()==a){
            int sum=n1+n2;
            j3.setText(Integer.toString(sum));
        }
        else{
            int sub=n1-n2;
            j3.setText(Integer.toString(sub));
            

        }
    }

public static void main(String[] args) {
    new button2();
}
}
