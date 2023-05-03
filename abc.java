import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class abc extends JFrame implements ActionListener{
    JMenu file,edit,view;
    JMenuBar mb;
    JMenuItem nnew,open,cut,copy,paste;
public abc(){   
    mb=new JMenuBar();
    file= new JMenu("file");
    edit=new JMenu("edit");
    view=new JMenu("view");
    nnew=new JMenu("New");
    open=new JMenu("Open");
    cut=new JMenu("cut");
    copy=new JMenu("copy");
file.add(nnew);
file.add(open);
edit.add(cut);
edit.add(copy);
mb.add(file);
mb.add(edit);
add(mb);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
setSize(500, 500);
nnew.addActionListener(this);
}
public void actionPerformed(ActionEvent aae) {
    JFrame f=new JFrame();
    f.setSize(200,200);
    f.setVisible(true);


}
public static void main(String[] args) {
    new abc();
}
    
}