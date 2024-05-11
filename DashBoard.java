import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashBoard extends JFrame implements ActionListener{

    DashBoard(){

        setSize(1920,720);
        ClassLoader.getSystemClassLoader();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons\\Third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1350, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb=new JMenuBar();

        //NEW INFORMATION
        
        JMenu newInformation=new JMenu("New Information");
        mb.add(newInformation);
        newInformation.setForeground(Color.BLUE);
        setJMenuBar(mb);

        JMenuItem facultyInfo=new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);

        JMenuItem studentInfo=new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);

        //DETAILS

        JMenu details=new JMenu("View Details");
        mb.add(details);
        details.setForeground(Color.RED);
        setJMenuBar(mb);

        JMenuItem facultydetails=new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails=new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        // Apply LEAVE

        JMenu leave=new JMenu("Apply Leave");
        mb.add(leave);
        leave.setForeground(Color.BLUE);
        setJMenuBar(mb);

        JMenuItem facultyleave=new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studentleave=new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);


        //LEAVE DETAILS

        JMenu leavedetails=new JMenu("Leave Details");
        mb.add(leavedetails);
        leavedetails.setForeground(Color.RED);
        setJMenuBar(mb);

        JMenuItem facultyleavedetails=new JMenuItem("Faculty Leave Details");
        facultyleave.setBackground(Color.WHITE);
        leavedetails.add(facultyleavedetails);

        JMenuItem studentleavedetails=new JMenuItem("Student Leave Details");
        studentleave.setBackground(Color.WHITE);
        leavedetails.add(studentleavedetails);

        //EXAMINATION

        JMenu exam=new JMenu("Examination");
        mb.add(exam);
        exam.setForeground(Color.BLUE);
        setJMenuBar(mb);

        JMenuItem examinationdetails=new JMenuItem("Examination Result");
        examinationdetails.addActionListener(this);
        examinationdetails.setBackground(Color.WHITE);
        exam.add(examinationdetails);

        JMenuItem entermarks=new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);

        //UPDATE FACULTY INFORMATION

        JMenu updateinfo=new JMenu("Update Details");
        mb.add(updateinfo);
        updateinfo.setForeground(Color.RED);
        setJMenuBar(mb);

        JMenuItem upadatefacultyinfo=new JMenuItem("Update Faculty Details");
        upadatefacultyinfo.setBackground(Color.WHITE);
        upadatefacultyinfo.addActionListener(this);
        updateinfo.add(upadatefacultyinfo);

        JMenuItem updatestudentinfo=new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateinfo.add(updatestudentinfo);

        //FEES

        JMenu fee=new JMenu("Fee Details");
        mb.add(fee);
        fee.setForeground(Color.BLUE);
        setJMenuBar(mb);

        JMenuItem feestructur=new JMenuItem("Fee Structure");
        feestructur.setBackground(Color.WHITE);
        feestructur.addActionListener(this);
        fee.add(feestructur);

        JMenuItem feeform=new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);

        //UTILITY

        JMenu utility=new JMenu("Utility");
        mb.add(utility);
        utility.setForeground(Color.RED);
        setJMenuBar(mb);

        JMenuItem notepad=new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc=new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);


        //ABOUT

        JMenu about=new JMenu("About");
        mb.add(about);
        about.setForeground(Color.BLUE);
        setJMenuBar(mb);

        JMenuItem ab=new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);

        //EXIT

        JMenu exit=new JMenu("Exit");
        mb.add(exit);
        exit.setForeground(Color.RED);
        setJMenuBar(mb);

        JMenuItem ex=new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);

        
        setVisible(true);

    }
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }else if(msg.equals("Calculator")){
            try{

                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){}
        }else if(msg.equals("Notepad")){
            try{

                Runtime.getRuntime().exec("notepad.exe");   
            }catch(Exception e){}
        }else if(msg.equals("New Faculty Information")){
            new AddTeacher();

        }else if(msg.equals("New Student Information")){
            new AddStudent();
        }else if(msg.equals("View Faculty Details")){
            new TeacherDetails();
        }else if(msg.equals("View Student Details")){
            new StudentDetails();
        }else if(msg.equals("Faculty Leave")){
            new TeacherLeave();
        }else if(msg.equals("Student Leave")){
            new StudentLeave();
        }else if(msg.equals("Update Faculty Details")){
            new UpdateTeacher();
        }else if(msg.equals("Update Student Details")){
            new UpdateStudent();
        }else if(msg.equals("Enter Marks")){
            new EnterMarks();
        }else if(msg.equals("Examination Result")){
            new ExaminationDetail();
        }else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }else if(msg.equals("About")){
            new About();
        }else if(msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }
    }
   
    public static void main(String[] args) {
        new DashBoard();
    }
}
   