
import java.awt.*;

import javax.swing.*;
public class About extends JFrame {

    About(){
        setSize(700,500);
        setLocation(300,150);
        getContentPane().setBackground(Color.WHITE);


        ClassLoader.getSystemClassLoader();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons\\about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,300,200);
        add(image);

        
        JLabel heading=new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70,20,250,130);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);

        JLabel name=new JLabel("Developed By: MR SKY");
        name.setBounds(50,220,400,90);
        name.setFont(new Font("Tahoma",Font.BOLD,30));
        add(name);

        JLabel rollno=new JLabel("Roll Number: 2211835201022");
        rollno.setBounds(50,280,400,90);
        rollno.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(rollno);

        JLabel contact=new JLabel("Contact: mrskycoding@gmail.com");
        contact.setBounds(50,350,400,90);
        contact.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(contact);

        setLayout(null);


        setVisible(true);

    }
    public static void main(String[] args) {
        new About();
    }
}
