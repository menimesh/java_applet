import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class classwork extends JFrame implements ActionListener{
    JTextField a;
    JTextField b;
    JButton c;
    public  classwork() {
        a=new JTextField(30);
        b=new JTextField(30);
       Button c=new Button("click here");
        add(a);
        add(c);
        add(b);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500, 500);
        c.addActionListener(this);    
    }
    public void actionPerformed(ActionEvent aae){
      if(a.equals(b)){
      c.setText("Equal");
    }}
    public static void main(String[] args) {
        new classwork();
    }
}