package university.management.system;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class EnterMarks extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b1;

    EnterMarks(){
          
       super("Enter Marks");
        setSize(600,650);
        setLocation(400,200);
        setLayout(null);

      

        l2 = new JLabel("Enter Roll No.");
       l2.setFont(new Font("sitka text",Font.BOLD,22));
       l2.setForeground(new Color(15,19,42));
        l2.setBounds(50,70,200,40);
        add(l2);

        t1 = new JTextField();
           t1.setFont(new Font("sitka text",Font.PLAIN,17));
        t1.setBounds(300,80,200,30);
        add(t1);

        l3 = new JLabel("  Subject");
        l3.setFont(new Font("sitka text",Font.BOLD,22));
         l3.setOpaque(true);
 
        l3.setBackground(new Color(15,19,42));
         l3.setForeground(Color.WHITE);
        l3.setBounds(50,150,200,40);
        add(l3);

        l4 = new JLabel( "  Marks");
        l4.setFont(new Font("sitka text",Font.BOLD,22));
         l4.setOpaque(true);
 
        l4.setBackground(new Color(15,19,42));
         l4.setForeground(Color.WHITE);
        l4.setBounds(300,150,200,40);
        add(l4);

        t2 = new JTextField();
        t2.setBounds(50,200,200,40);
        t2.setFont(new Font("sitka text",Font.PLAIN,17));
        add(t2);

        t3 = new JTextField();
           t3.setFont(new Font("sitka text",Font.PLAIN,17));
        t3.setBounds(300,200,200,40);
        add(t3);

        t4 = new JTextField();
           t4.setFont(new Font("sitka text",Font.PLAIN,17));
        t4.setBounds(50,250,200,40);
        add(t4);

        t5 = new JTextField();
           t5.setFont(new Font("sitka text",Font.PLAIN,17));
        t5.setBounds(300,250,200,40);
        add(t5);

        t6 = new JTextField();
           t6.setFont(new Font("sitka text",Font.PLAIN,17));
        t6.setBounds(50,300,200,40);
        add(t6);

        t7 = new JTextField();
           t7.setFont(new Font("sitka text",Font.PLAIN,17));
        t7.setBounds(300,300,200,40);
        add(t7);

        t8 = new JTextField();
           t8.setFont(new Font("sitka text",Font.PLAIN,17));
        t8.setBounds(50,350,200,40);
        add(t8);

        t9 = new JTextField();
           t9.setFont(new Font("sitka text",Font.PLAIN,17));
        t9.setBounds(300,350,200,40);
        add(t9);

        t10 = new JTextField();
           t10.setFont(new Font("sitka text",Font.PLAIN,17));
        t10.setBounds(50,400,200,40);
        add(t10);

        t11 = new JTextField();
           t11.setFont(new Font("sitka text",Font.PLAIN,17));
        t11.setBounds(300,400,200,40);
        add(t11);

        b1 = new JButton("Submit");
        b1.setBounds(250,460,100,50);
        b1.setFont(new Font("sitka text",Font.BOLD,17));
         b1.setBackground(new Color(15,19,42));
        b1.setForeground(Color.WHITE);
 
        add(b1);

        b1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == b1){
                Conn c1 = new Conn();

                String s1 = "insert into subject values('"+t1.getText()+"','"+t2.getText()+"','"+t4.getText()+"','"+t6.getText()+"','"+t8.getText()+"','"+t10.getText()+"')";
                String s2 = "insert into marks values('"+t1.getText()+"','"+t3.getText()+"','"+t5.getText()+"','"+t7.getText()+"','"+t9.getText()+"','"+t11.getText()+"')";

                c1.s.executeUpdate(s1);
                c1.s.executeUpdate(s2);
                
                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                this.setVisible(false);

            }
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new EnterMarks().setVisible(true);
    }
}

