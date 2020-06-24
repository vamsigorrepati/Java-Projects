import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JFrame;import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class MainFrame extends JFrame {
    static JFrame f; 
    public JPanel contentPane;
    public JLabel imageLabel = new JLabel();
    public JLabel headerLabel = new JLabel();

    public MainFrame() {

        try {
            f = new JFrame("Chose your Drink"); 
            JPanel panel = new JPanel();

            ImageIcon ii = new ImageIcon(new URL("https://www.coca-colaindia.com/content/dam/journey/in/en/private/stories/history/the_logo_story_01122014_596x334.rendition.320.179.jpg"));
            JButton Coke = new JButton(ii);
            Coke.setPreferredSize(new Dimension(320, 179));
            panel.add(Coke,BorderLayout.CENTER);

            ImageIcon i2 = new ImageIcon(new URL("https://www.logolynx.com/images/logolynx/s_15/154e7e80d877af85cb3c063ef88bab8a.jpeg"));
            JButton Lemonade = new JButton(i2);
            Lemonade.setPreferredSize(new Dimension(250, 250));
            panel.add(Lemonade,BorderLayout.CENTER);

            f.add(panel);
            f.setSize(600, 300); 
            f.show();

            Coke.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {  
                        play coke = new play();
                    }

                });
                
            Lemonade.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {  
                        play coke = new play(5);
                    }

                });
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new MainFrame();
    }
}


