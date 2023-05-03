import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class button1 extends JFrame implements ActionListener{
    JTextField a;
    JButton b;
    button1(){
        a=new JTextField(20);
       Button b=new Button("click");
       setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500,500);
        add(b);
        add(a);
        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
     
        b.setText(str);
    }

    public static void main(String[] args) {
      new button1();
        
    }

    
}

