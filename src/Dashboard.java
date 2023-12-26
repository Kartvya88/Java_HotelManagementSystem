import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    Dashboard(){
        setBounds(0, 0, 1600, 1000);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JLabel topText = new JLabel("The Taj Group Welcomes You");
        topText.setBounds(400,80,1000,50);
        add(topText);
        setVisible(true);
    }
    public static void main(String[] args) {
new Dashboard();
    }
}
