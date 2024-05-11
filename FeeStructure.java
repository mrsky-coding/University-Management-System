import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.*;

public class FeeStructure extends JFrame{
    

    FeeStructure(){
        setSize(1000,650);
        setLocation(150,10);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel heading=new JLabel("Fee Structure");
        heading.setBounds(50,10,400,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);

        JTable table=new JTable();

        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception e){
            e.printStackTrace();
        }

        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,60,1000,650);
        add(jsp);






        setVisible(true);

    }
    public static void main(String[] args) {
        new FeeStructure();
    }
}
