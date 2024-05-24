import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {

    public JButton on;
    public JButton off;

    public JLabel player;
    public JLabel start;
    public JLabel finish;
    static final int WIDTH = 1000;
    static final int HEIGHT = 800;

    Game(){

        on = new JButton("ON");
        on.setBounds(200,500,200,100);
        on.setFont(new Font("Arial",Font.PLAIN,50));
        on.setFocusable(false);
        on.setBackground(new Color(0,0,0));
        on.setForeground(new Color(255,255,255));
        on.addActionListener(e -> player.setVisible(true));

        off = new JButton("OFF");
        off.setBounds(600,500,200,100);
        off.setFont(new Font("Arial",Font.PLAIN,50));
        off.setFocusable(false);
        off.setBackground(new Color(0,0,0));
        off.setForeground(new Color(255,255,255));
        off.addActionListener(e -> player.setVisible(false));

        player = new JLabel();
        player.setBackground(new Color(100,80,200));
        player.setOpaque(true);
        player.setBounds(100,0,100,100);

        start = new JLabel();
        start.setBackground(new Color(10,80,250));
        start.setOpaque(true);
        start.setBounds(0,0,100,100);

        finish = new JLabel();
        finish.setBackground(new Color(200,10,10));
        finish.setOpaque(true);
        finish.setBounds(890,660,100,100);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0,0,0));
        this.setLayout(null);
        this.setBounds(0,0,WIDTH,HEIGHT);
        this.setLocationRelativeTo(null);
        this.setTitle("Rectangle-Mania");
        this.setResizable(false);
        this.addKeyListener(this);
        this.add(on);
        this.add(off);
        this.add(player);
        this.add(start);
        this.add(finish);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'w' -> player.setLocation(player.getX() , player.getY() - 10);
            case 'a' -> player.setLocation(player.getX() - 10 , player.getY());
            case 's' -> player.setLocation(player.getX(), player.getY() + 10);
            case 'd' -> player.setLocation(player.getX() + 10 , player.getY());
        }

    }


    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        checkCollision();
        myController control = new myController();
        control.moveUp();
        control.moveDown();
        control.moveRight();
        control.moveLeft();
        control.resetPosition();


    }

    public void checkCollision() {
        Rectangle bounds1 = player.getBounds();
        Rectangle bounds2 = start.getBounds();
        Rectangle bounds3 = finish.getBounds();
        Rectangle bounds4 = on.getBounds();
        Rectangle bounds5 = off.getBounds();

        if (bounds1.intersects(bounds2)) {
            this.dispose();
            JOptionPane.showConfirmDialog(this,"VDM Exception Error");
            new Game_Over();
            player.setBounds(100,0,100,100);
        } else if (bounds1.intersects(bounds3)) {
            this.dispose();
            JOptionPane.showConfirmDialog(this,"Excellent");
            new Destination();
            player.setBounds(100,0,100,100);
        }else if (bounds1.intersects(bounds4)) {
            this.dispose();
            JOptionPane.showConfirmDialog(this,"VDM Exception Error");
            new Game_Over();
            player.setBounds(100,0,100,100);
        } else if (bounds1.intersects(bounds5)){
            this.dispose();
            JOptionPane.showConfirmDialog(this,"VDM Exception Error");
            new Game_Over();
            player.setBounds(100,0,100,100);
        }
        else if (player.getX() > WIDTH || player.getY() > HEIGHT) {
            this.dispose();
            JOptionPane.showConfirmDialog(this,"VDM Exception Error");
            new Game_Over();
        }else if(player.getX() < 0 || player.getY() < 0){
             this.dispose();
            JOptionPane.showConfirmDialog(this,"VDM Exception Error");
             new Game_Over();
        }
    }
}
