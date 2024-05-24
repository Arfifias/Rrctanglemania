import javax.swing.*;
import java.awt.*;

public class Destination extends JFrame {
    public JLabel destination;
    public JButton back;


    Destination(){

        destination = new JLabel("Destination Reached");
        destination.setFont(new Font("Arial", Font.PLAIN, 100));
        destination.setForeground(new Color(0, 255, 0));
        destination.setBounds(30,100,975,500);

        back = new JButton("Back");
        back.setBounds(400,500,200,100);
        back.setFont(new Font("Arial",Font.PLAIN,50));
        back.setFocusable(false);
        back.setBackground(new Color(0,0,0));
        back.setForeground(new Color(255,255,255));
        back.addActionListener(e -> new Game());



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setLayout(null);
        this.setBounds(0, 0, 1000, 750);
        this.setLocationRelativeTo(null);
        this.setTitle("Rectangle-Mania");
        this.add(destination);
        this.add(back);
        this.setVisible(true);
    }


}
