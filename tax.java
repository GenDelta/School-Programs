import java.awt.BorderLayout;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
import javax.swing.*;
import javax.swing.JOptionPane;
public class tax extends JFrame
{
    static JFrame f;    
    public static void table()
    {    
        f=new JFrame();    
        String data[][]={ {"Upto ₹2,50,000","Nil"},{"₹2,50,001 - ₹5,00,000","5% above ₹ 2,50,000"},
        {"₹5,00,001 - ₹7,50,000","₹12,500 + 10% above ₹5,00,000"},{"₹7,50,001 - ₹10,00,000","₹ 37,500 + 15% above ₹7,50,000"},
        {"₹10,00,001 - ₹12,50,000","₹75,000 + 20% above ₹10,00,000"},{"₹12,50,001 - ₹15,00,000","₹1,25,000 + 25% above ₹12,50,000"},
        {"Above ₹15,00,000","₹1,87,500 + 30% above ₹15,00,000"}};    
        String column[]={"Taxable Income (Income - ₹5,00,000)","Income Tax Rate"};         
        JTable jt=new JTable(data,column);    
        jt.setBounds(300,400,2000,3000);          
        JScrollPane sp=new JScrollPane(jt);    
        f.add(sp);          
        f.setSize(300,400);    
        f.setVisible(true);    
    }
    public static void case1(int amt)
    {
        table();
        int a=amt-500000;
        int tax=(0*a)/100;
        Frame frame = new Frame("Example Frame");
        if(amt>750000)
        {
            f.setTitle("Incorrect income range selected");
            f.setBounds(100,50,500,300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
        else
        {
            Component textArea = new TextArea("Taxable income : "+a+"\n"+"Income tax on entered salary : "+tax);
            frame.add(textArea, BorderLayout.NORTH);
            frame.setSize(300,300);
            frame.setVisible(true);
        }
    }
    public static void case2(int amt)
    {
        table();
        int a=amt-500000;
        int tax=(5*(a-250000))/100;
        Frame frame = new Frame("Example Frame");
        if(amt<=750000 || amt>1000000)
        {
            f.setTitle("Incorrect income range selected");
            f.setBounds(100,50,500,300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
        else
        {
            Component textArea = new TextArea("Taxable income : "+a+"\n"+"Income tax on entered salary : "+tax);
            frame.add(textArea, BorderLayout.NORTH);
            frame.setSize(300,300);
            frame.setVisible(true);
        }
    }
    public static void case3(int amt)
    {
        table();
        int a=amt-500000;
        int tax=12500+((10*(a-500000))/100);
        Frame frame = new Frame("Example Frame");
        if(amt<=1000000 || amt>1250000)
        {
            f.setTitle("Incorrect income range selected");
            f.setBounds(100,50,500,300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
        else
        {
            Component textArea = new TextArea("Taxable income : "+a+"\n"+"Income tax on entered salary : "+tax);
            frame.add(textArea, BorderLayout.NORTH);
            frame.setSize(300,300);
            frame.setVisible(true);
        }
    }
    public static void case4(int amt)
    {
        table();
        int a=amt-500000;
        int tax=37500+((15*(a-750000))/100);
        Frame frame = new Frame("Example Frame");
        if(amt<=1250000 || amt>1500000)
        {
            f.setTitle("Incorrect income range selected");
            f.setBounds(100,50,500,300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
        else
        {
            Component textArea = new TextArea("Taxable income : "+a+"\n"+"Income tax on entered salary : "+tax);
            frame.add(textArea, BorderLayout.NORTH);
            frame.setSize(300,300);
            frame.setVisible(true);
        }
    }
    public static void case5(int amt)
    {
        table();
        int a=amt-500000;
        int tax=75000+((20*(a-1000000))/100);
        Frame frame = new Frame("Example Frame");
        if(amt<=1500000 || amt>1750000)
        {
            f.setTitle("Incorrect income range selected");
            f.setBounds(100,50,500,300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
        else
        {
            Component textArea = new TextArea("Taxable income : "+a+"\n"+"Income tax on entered salary : "+tax);
            frame.add(textArea, BorderLayout.NORTH);
            frame.setSize(300,300);
            frame.setVisible(true);
        }
    }
    public static void case6(int amt)
    {
        table();
        int a=amt-500000;
        int tax=125000+((25*(a-1250000))/100);
        Frame frame = new Frame("Example Frame");
        if(amt<=1750000 || amt>2000000)
        {
            f.setTitle("Incorrect income range selected");
            f.setBounds(100,50,500,300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
        else
        {
            Component textArea = new TextArea("Taxable income : "+a+"\n"+"Income tax on entered salary : "+tax);
            frame.add(textArea, BorderLayout.NORTH);
            frame.setSize(300,300);
            frame.setVisible(true);
        }
    }
    public static void case7(int amt)
    {
        table();
        int a=amt-500000;
        int tax=187500+((30*(a-1500000))/100);
        Frame frame = new Frame("Example Frame");
        if(amt<=2000000)
        {
            f.setTitle("Incorrect income range selected");
            f.setBounds(100,50,500,300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
        else
        {
            Component textArea = new TextArea("Taxable income : "+a+"\n"+"Income tax on entered salary : "+tax);
            frame.add(textArea, BorderLayout.NORTH);
            frame.setSize(300,300);
            frame.setVisible(true);
        }
    }
    public static int accept()
    {
        int income=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter annual income to calculate taxable income and income tax"));
        return income;
    }
    public static void display() 
    {
        int amt=accept();
        SwingUtilities.invokeLater(()-> 
        {
            var initialText="Choose the price bracket of your income from the options give below";
            var area=new JTextArea(initialText,8,50);
            var b1=new JButton("Income<=750000");
            var b2=new JButton("750000<Income<=1000000");
            var b3=new JButton("1000000<Income<=1250000");
            var b4=new JButton("1250000<Income<=1500000");
            var b5=new JButton("1500000<Income<=1750000");
            var b6=new JButton("1750000<Income<=2000000");
            var b7=new JButton("Income>2000000");
            
            b1.addActionListener(e->case1(amt));
            b2.addActionListener(e->case2(amt));
            b3.addActionListener(e->case3(amt));
            b4.addActionListener(e->case4(amt));
            b5.addActionListener(e->case5(amt));
            b6.addActionListener(e->case6(amt));
            b7.addActionListener(e->case7(amt));
            
            var buttonPanel = new JPanel();
            buttonPanel.add(b1);
            buttonPanel.add(b2);
            buttonPanel.add(b3);
            buttonPanel.add(b4);
            buttonPanel.add(b5);
            buttonPanel.add(b6);
            buttonPanel.add(b7);
            
            var frame = new JFrame("Tax Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);
            frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
            frame.pack();
            frame.setVisible(true);
        });
    }
    public static void main()
    {
        display();
    }
}