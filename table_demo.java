import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
class table_demo extends JFrame{
    JTable tbl;
    String[] cols={"Name","Address"};
    String[][] rows={
        {"Salman khan","Jhapa"},
        {"Nimesh ","Jhapa"}
    };
    public  table_demo() {
        tbl=new JTable(rows,cols);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500,500);
        add(tbl);

        
    }
    public static void main(String[] args) {
        new table_demo();
    }
    
}
