import java.awt.*;
import java.awt.event.*;

import java.sql.*;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class StudentLeave extends JFrame implements ActionListener {

    Choice crollno, ctime;
    JDateChooser dcdate;
    JButton submit, cancel;

    StudentLeave() {

        setSize(500, 550);
        setLocation(400, 100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel("Apply Leave (Student)");
        heading.setBounds(150, 70, 300, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);

        JLabel lblrollno = new JLabel("Search by Roll Number");
        lblrollno.setBounds(60, 130, 200, 20);
        lblrollno.setFont(new Font("Serif", Font.PLAIN, 18));
        add(lblrollno);

        crollno = new Choice();
        crollno.setBounds(270, 130, 150, 20);
        add(crollno);

        try {

            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select *from student");
            while (rs.next()) {
                crollno.add(rs.getString("rollno"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60, 180, 200, 20);
        lbldate.setFont(new Font("Serif", Font.PLAIN, 18));
        add(lbldate);

        dcdate = new JDateChooser();
        dcdate.setBounds(270, 180, 150, 30);
        add(dcdate);

        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60, 240, 200, 20);
        lbltime.setFont(new Font("Serif", Font.PLAIN, 18));
        add(lbltime);

        ctime = new Choice();
        ctime.setBounds(270, 240, 150, 20);
        ctime.add("Full Day");
        ctime.add("Half Day");
        add(ctime);

        submit = new JButton("Submit");
        submit.setBounds(80, 350, 100, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("serif", Font.BOLD, 16));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(250, 350, 100, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 16));
        add(cancel);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == submit) {

            String rollno=crollno.getSelectedItem();
            String date=((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
            String duration=ctime.getSelectedItem();

            String query="insert into studentleave values('"+rollno+"','"+date+"','"+duration+"')";

            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Leave Confirmed");
                setVisible(false);

            }catch(Exception e){
                e.printStackTrace();
            }

        } else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new StudentLeave();
    }
}
