import javax.swing.*;
public class OutputFrame {
    
    public static void main(String[] args) {    
        
        JFrame frame = new JFrame("Output Screen");
        
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();    
        frame.add(panel);
        
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel dateLabel = new JLabel("Date (dd)");

        dateLabel.setBounds(10,20,80,25);
        panel.add(dateLabel);

        JTextField dateText = new JTextField(20);
        dateText.setBounds(100,20,165,25);
        panel.add(dateText);

        JLabel monthLabel = new JLabel("Month (mm)");
        monthLabel.setBounds(10,50,80,25);
        panel.add(monthLabel);
        JTextField monthText = new JTextField(20);
        monthText.setBounds(100,50,165,25);
        panel.add(monthText);
        
        JLabel yearLabel = new JLabel("Year (yyyy)");
        yearLabel.setBounds(10,80,80,25);
        panel.add(yearLabel);
        JTextField yearText = new JTextField(20);
        yearText.setBounds(100,80,165,25);
        panel.add(yearText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 110, 80, 25);
        panel.add(loginButton);
    }

}