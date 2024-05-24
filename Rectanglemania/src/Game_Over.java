import javax.swing.*;
import java.awt.*;

public class Game_Over extends JFrame {

    public JLabel game_over;
    public JButton back;

    Game_Over() {

        game_over = new JLabel("GAME OVER");
        game_over.setFont(new Font("Arial", Font.PLAIN, 100));
        game_over.setForeground(new Color(255, 0, 0));
        game_over.setBounds(175,100,700,500);

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
        this.add(game_over);
        this.add(back);
        this.setVisible(true);
    }

}
