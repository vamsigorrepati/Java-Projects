import java.awt.*;
import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;
public class play extends JFrame {

    JPanel contentPane;
    JLabel imageLabel = new JLabel();
    JLabel headerLabel = new JLabel();

    public play() {

        try {

            
            contentPane = (JPanel) getContentPane();
            contentPane.setLayout(new BorderLayout());
            setSize(new Dimension(500, 400));
            setTitle("Drinkkkkkkkkkkkkkkk");

            headerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
            headerLabel.setText("Have some CoLa");
            contentPane.add(headerLabel, BorderLayout.NORTH);

            ImageIcon ii = new ImageIcon(new URL("http://1.bp.blogspot.com/-TKFd8KZtLew/VQrwRJnXteI/AAAAAAAAKFw/kGmPE74pvmo/s1600/bec61.gif"));
            imageLabel.setIcon(ii);
            contentPane.add(imageLabel, BorderLayout.CENTER);

            this.setLocationRelativeTo(null);

            this.setVisible(true);

            URL url = new URL("https://www.pacdv.com/sounds/voices/mmm-1.wav");
            

            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.
                getAudioInputStream( url );
            clip.open(ais);
            clip.loop(1);
           

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
    public play(int a) {
        try {
            
            contentPane = (JPanel) getContentPane();
            contentPane.setLayout(new BorderLayout());
            setSize(new Dimension(480, 700));
            setTitle("Drinkkkkkkkkkkkkkkk");

            headerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
            headerLabel.setText("Get you some Lemonade");
            contentPane.add(headerLabel, BorderLayout.NORTH);

            ImageIcon ii = new ImageIcon(new URL("https://www.linda.nl/lindanl-assets/uploads/2019/02/baby-drank-oppas28.gif"));
            imageLabel.setIcon(ii);
            contentPane.add(imageLabel, BorderLayout.CENTER);

            this.setLocationRelativeTo(null);

            this.setVisible(true);
            

            URL url = new URL("https://www.pacdv.com/sounds/voices/yummy.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.
                getAudioInputStream( url );
            clip.open(ais);
            clip.loop(1);
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}


