import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;

public class Login extends JFrame implements ActionListener {
    //Constructor
    Login(){
       //setting the frame
 getContentPane().setBackground(Color.WHITE);
 setLayout(null);

 JLabel userName = new JLabel("User Name");
 userName.setBounds(40,20,100,30);
 add(userName);

 JLabel password = new JLabel("Password");
 password.setBounds(40,70,100,30);
 add(password);

 JTextField userField = new JTextField();
 userField.setBounds(150, 20, 150, 30);
 add(userField);


 JTextField passField = new JTextField();
 passField.setBounds(150, 70, 150, 30);
 add(passField);

 //Login Button Design
 JButton login = new JButton("Login");
 login.setBackground(Color.BLACK);
 login.setForeground(Color.WHITE);
 login.setFont(new Font("Serif", Font.PLAIN, 15));
 login.setBounds(40,150,120,30);
 add(login);

 //Cancel Button Design
        JButton cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Serif", Font.PLAIN, 15));
        cancel.setBounds(40,200,120,30);
        add(cancel);

 //Back Button Design
        JButton back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Serif", Font.PLAIN, 15));
        back.addActionListener(this::actionPerformed);
        back.setBounds(390,200,120,30);
        add(back);

        //Adding a Image in the Layout
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imgLabel = new JLabel(i3);
        imgLabel.setBounds(350,10,200,200);
        add(imgLabel);

 setBounds(500,200,600,300);
 setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
        //Login object calling the constructor
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new HotelManagement();
    }
}
