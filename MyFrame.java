import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame(){

        ImageIcon icon=new ImageIcon("thumbsup.png");
        ImageIcon icon2=new ImageIcon("multiverse.jpg");

        label=new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,100,100);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,200,125);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.ITALIC,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); //for disabling the button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("poo");
            //button.setEnabled(false); //to make the button clickable only once
            label.setVisible(true);
        }
    }
    public static void main(String[] args) {

        new MyFrame();

    }
}
