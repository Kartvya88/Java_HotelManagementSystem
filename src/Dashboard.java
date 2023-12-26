import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    Dashboard(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1950,1000);
        add(image);

        JLabel topText = new JLabel("The Taj Group Welcomes You");
        topText.setBounds(600,60,1000,85);
        topText.setFont(new Font("Serif", Font.BOLD, 45));
        image.add(topText);


        //Adding menu bar on the top-left corner
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1950,30);
        image.add(mb);

        JMenu hotel = new JMenu("Hotel Management");
        hotel.setForeground(Color.BLUE);
        mb.add(hotel);

        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.RED);
        mb.add(admin);

        JMenuItem reception = new JMenuItem("Reception");
        JMenuItem addemployee = new JMenuItem("addemployee");
        admin.add(addemployee);
        hotel.add(reception);


        setVisible(true);
    }
    public static void main(String[] args) {
new Dashboard().setVisible(true);
    }
}
