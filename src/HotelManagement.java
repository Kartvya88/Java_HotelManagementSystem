import javax.swing.*;

public class HotelManagement extends JFrame {

    HotelManagement(){
 setSize(1366,565 );
 setLocation(100,100);
 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
 JLabel image = new JLabel(i1);
 add(image);
 setVisible(true);
 
    }
    public static void main(String[] args) {
        new HotelManagement();
    }


}
