package university.management.system;


import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    
    public FeeStructure(){
        
        super("Fee Structure");
        setSize(1700,800);
        setLocation(100,100);
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setForeground(new Color(15,19,42));
        i1.setFont(new Font("sitka text",Font.BOLD,56));
        i1.setBounds(500,10,400,70);
        add(i1);
        
        l1 = new JLabel("Course");
        l1.setBounds(20,100,100,40);
        l1.setForeground(new Color(15,19,42));
        l1.setFont(new Font("sitka text",Font.BOLD,26));
        add(l1);
        
        l2 = new JLabel("BTech");
        l2.setBounds(220,100,100,40);
         l2.setForeground(new Color(15,19,42));
        l2.setFont(new Font("sitka text",Font.BOLD,26));
        add(l2);
        
        l3 = new JLabel("BCA");
        l3.setBounds(420,100,100,40);
        l3.setForeground(new Color(15,19,42));
        l3.setFont(new Font("sitka text",Font.BOLD,26));
        add(l3);
        
        l4 = new JLabel("BBA");
        l4.setBounds(620,100,100,40);
        l4.setForeground(new Color(15,19,42));
        l4.setFont(new Font("sitka text",Font.BOLD,26));
        add(l4);
        
        bb5 = new JLabel("Rs 25000");
        bb5.setBounds(620,170,150,40);
           bb5.setForeground(new Color(15,19,42));
        bb5.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb5);
        
        bb6 = new JLabel("Rs 25000");
        bb6.setBounds(620,240,150,40);
        bb6.setForeground(new Color(15,19,42));
        bb6.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb6);
        
        bb7 = new JLabel("Rs 25000");
        bb7.setBounds(620,310,150,40);
         bb7.setForeground(new Color(15,19,42));
        bb7.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb7);
        
        bb8 = new JLabel("Rs 25000");
        bb8.setBounds(620,380,150,40);
        bb8.setForeground(new Color(15,19,42));
        bb8.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb8);
        
        bb13 = new JLabel("Rs 25000");
        bb13.setBounds(620,450,150,40);
        bb13.setForeground(new Color(15,19,42));
        bb13.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb13);
        
        bb14 = new JLabel("Rs 25000");
        bb14.setBounds(620,520,150,40);
         bb14.setForeground(new Color(15,19,42));
        bb14.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb14);
        
        l5 = new JLabel("Bsc");
        l5.setBounds(820,100,100,40);
        l5.setForeground(new Color(15,19,42));
        l5.setFont(new Font("sitka text",Font.BOLD,26));
        add(l5);
        
        bb9 = new JLabel("Rs 18000");
        bb9.setBounds(820,170,150,40);
         bb9.setForeground(new Color(15,19,42));
        bb9.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb9);
        
        bb10 = new JLabel("Rs 18000");
        bb10.setBounds(820,240,150,40);
         bb10.setForeground(new Color(15,19,42));
        bb10.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb10);
        
        bb11 = new JLabel("Rs 18000");
        bb11.setBounds(820,310,150,40);
         bb11.setForeground(new Color(15,19,42));
        bb11.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb11);
        
        bb12 = new JLabel("Rs 18000");
        bb12.setBounds(820,380,150,40);
         bb12.setForeground(new Color(15,19,42));
        bb12.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb12);
        
        bb15 = new JLabel("Rs 18000");
        bb15.setBounds(820,450,150,40);
         bb15.setForeground(new Color(15,19,42));
        bb15.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb15);
        
        bb16 = new JLabel("Rs 18000");
        bb16.setBounds(820,520,150,40);
         bb16.setForeground(new Color(15,19,42));
        bb16.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb16);
        
        l6 = new JLabel("MBA");
        l6.setBounds(1020,100,100,40);
          l6.setForeground(new Color(15,19,42));
        l6.setFont(new Font("sitka text",Font.BOLD,26));
        add(l6);
        
        m1 = new JLabel("Rs 65000");
        m1.setBounds(1020,170,150,40);
        m1.setForeground(new Color(15,19,42));
        m1.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m1);
        
        m2 = new JLabel("Rs 65000");
        m2.setBounds(1020,240,150,40);
        m2.setForeground(new Color(15,19,42));
        m2.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m2);
        
        m3 = new JLabel("Rs 65000");
        m3.setBounds(1020,310,150,40);
        m3.setForeground(new Color(15,19,42));
        m3.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m3);
        
        m4 = new JLabel("Rs 65000");
        m4.setBounds(1020,380,150,40);
        m4.setForeground(new Color(15,19,42));
        m4.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m4);
        
        l7 = new JLabel("MCA");
        l7.setBounds(1220,100,100,40);
        l7.setForeground(new Color(15,19,42));
        l7.setFont(new Font("sitka text",Font.BOLD,26));
        add(l7);
        
        m5 = new JLabel("Rs 55000");
        m5.setBounds(1220,170,150,40);
        m5.setForeground(new Color(15,19,42));
        m5.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m5);
        
        m6 = new JLabel("Rs 55000");
        m6.setBounds(1220,240,150,40);
        m6.setForeground(new Color(15,19,42));
        m6.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m6);
        
        m7 = new JLabel("Rs 55000");
        m7.setBounds(1220,310,150,40);
        m7.setForeground(new Color(15,19,42));
        m7.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m7);
        
        m8 = new JLabel("Rs 55000");
        m8.setBounds(1220,380,150,40);
        m8.setForeground(new Color(15,19,42));
        m8.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m8);
        
        l8 = new JLabel("MTech");
        l8.setBounds(1410,100,100,40);
        l8.setForeground(new Color(15,19,42));
        l8.setFont(new Font("sitka text",Font.BOLD,26));
        add(l8);
        
        m9 = new JLabel("Rs 81000");
        m9.setForeground(new Color(15,19,42));
        m9.setBounds(1410,170,150,40);
        m9.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m9);
        
        m10 = new JLabel("Rs 81000");
        m10.setForeground(new Color(15,19,42));
        m10.setBounds(1410,240,150,40);
        m10.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m10);
        
        m11 = new JLabel("Rs 81000");
        m11.setBounds(1410,310,150,40);
         m11.setForeground(new Color(15,19,42));
        m11.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m11);
        
        m12 = new JLabel("Rs 81000");
        m12.setBounds(1410,380,150,40);
        m12.setForeground(new Color(15,19,42));
        m12.setFont(new Font("sitka text",Font.PLAIN,26));
        add(m12);
        
        l10 = new JLabel("Semester 1");
        l10.setBounds(20,170,150,40);
         l10.setForeground(new Color(15,19,42));
        l10.setFont(new Font("sitka text",Font.BOLD,26));
        add(l10);
        
        l11 = new JLabel("Semester 2");
        l11.setBounds(20,240,150,40);
         l11.setForeground(new Color(15,19,42));
        l11.setFont(new Font("sitka text",Font.BOLD,26));
        add(l11);
        
        l12 = new JLabel("Semester 3");
        l12.setBounds(20,310,150,40);
        l12.setForeground(new Color(15,19,42));
        l12.setFont(new Font("sitka text",Font.BOLD,26));
        add(l12);
        
        l13 = new JLabel("Semester 4");
        l13.setBounds(20,380,150,40);
        l13.setForeground(new Color(15,19,42));
        l13.setFont(new Font("sitka text",Font.BOLD,26));
        add(l13);
        
        l14 = new JLabel("Semester 5");
        l14.setBounds(20,450,150,40);
        l14.setForeground(new Color(15,19,42));
        l14.setFont(new Font("sitka text",Font.BOLD,26));
        add(l14);
        
        l15 = new JLabel("Semester 6");
        l15.setBounds(20,520,150,40);
          l15.setForeground(new Color(15,19,42));
        l15.setFont(new Font("sitka text",Font.BOLD,26));
        add(l15);
        
        l16 = new JLabel("Semester 7");
        l16.setBounds(20,590,150,40);
        l16.setForeground(new Color(15,19,42));
        l16.setFont(new Font("sitka text",Font.BOLD,26));
        add(l16);
        
        l17 = new JLabel("Semester 8");
        l17.setBounds(20,660,150,40);
        l17.setForeground(new Color(15,19,42));
        l17.setFont(new Font("sitka text",Font.BOLD,26));
        add(l17);
        
        
        b1 = new JLabel("Rs 55000");
        b1.setBounds(220,170,150,40);
          b1.setForeground(new Color(15,19,42));
        b1.setFont(new Font("sitka text",Font.PLAIN,26));
        add(b1);
        
        b2 = new JLabel("Rs 55000");
        b2.setBounds(220,240,150,40);
          b2.setForeground(new Color(15,19,42));
        b2.setFont(new Font("sitka text",Font.PLAIN,26));
        add(b2);
        
        b3 = new JLabel("Rs 55000");
        b3.setBounds(220,310,150,40);
          b3.setForeground(new Color(15,19,42));
        b3.setFont(new Font("sitka text",Font.PLAIN,26));
        add(b3);
        
        b4 = new JLabel("Rs 55000");
        b4.setBounds(220,380,150,40);
          b4.setForeground(new Color(15,19,42));
        b4.setFont(new Font("sitka text",Font.PLAIN,26));
        add(b4);
        
        b5 = new JLabel("Rs 55000");
        b5.setBounds(220,450,150,40);
          b5.setForeground(new Color(15,19,42));
        b5.setFont(new Font("sitka text",Font.PLAIN,26));
        add(b5);
        
        b6 = new JLabel("Rs 43000");
        b6.setBounds(220,520,150,40);
          b6.setForeground(new Color(15,19,42));
        b6.setFont(new Font("sitka text",Font.PLAIN,26));
        add(b6);
        
        b7 = new JLabel("Rs 55000");
        b7.setBounds(220,590,150,40);
          b7.setForeground(new Color(15,19,42));
        b7.setFont(new Font("sitka text",Font.PLAIN,26));
        add(b7);
        
        b8 = new JLabel("Rs 55000");
        b8.setBounds(220,660,150,40);
          b8.setForeground(new Color(15,19,42));
        b8.setFont(new Font("sitka text",Font.PLAIN,26));
        add(b8);
        
        
        bb1 = new JLabel("Rs 32000");
          bb1.setForeground(new Color(15,19,42));
        bb1.setBounds(420,170,150,40);
        bb1.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb1);
        
        bb2 = new JLabel("Rs 32000");
        bb2.setBounds(420,240,150,40);
        bb2.setForeground(new Color(15,19,42));
        bb2.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb2);
        
        bb3 = new JLabel("Rs 32000");
        bb3.setBounds(420,310,150,40);
        bb3.setForeground(new Color(15,19,42));
        bb3.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb3);
        
        bb4 = new JLabel("Rs 32000");
        bb4.setBounds(420,380,150,40);
        bb4.setForeground(new Color(15,19,42));
        bb4.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb4);
        
        bb17 = new JLabel("Rs 32000");
        bb17.setBounds(420,450,150,40);
        bb17.setForeground(new Color(15,19,42));
        bb17.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb17);
        
        bb18 = new JLabel("Rs 32000");
        bb18.setBounds(420,520,150,40);
        bb18.setForeground(new Color(15,19,42));
        bb18.setFont(new Font("sitka text",Font.PLAIN,26));
        add(bb18);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}