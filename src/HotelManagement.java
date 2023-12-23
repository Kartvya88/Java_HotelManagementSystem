import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Implemented Action Listener Interface
public class HotelManagement extends JFrame implements ActionListener {

    HotelManagement(){
 setSize(1366,565 );
 setLocation(100,100);
 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
 JLabel image = new JLabel(i1);
 add(image);

 //Adding a Hotel Management Systm Text above the image
        JLabel text = new JLabel("Hotel Management System");
        text.setBounds(25,430,1000,90);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif", Font.PLAIN, 50));
        image.add(text);

  //Adding a NEXT button above Image
  JButton btn = new JButton("Next");
  btn.setFont(new Font("Arial", Font.ITALIC, 20));
  btn.setBounds(930,450, 150,50);
  image.add(btn);

setVisible(true);

  //Blink functionality in the TEXT
        while(true){
            text.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
            text.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        new HotelManagement();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
