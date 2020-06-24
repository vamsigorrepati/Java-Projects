import java.util.Scanner;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Ball8 extends JPanel{
    public void paint(Graphics g)
    {
    setBackground (Color.yellow);
    
    int x = 260;
    int y = 200;
    int width = 500;
    int length = 500;
    // This shows the x and y start of for the Black Ball
    // Also shows the length and width of the ball, both are the same to make it a circle
    
    int x2 = x + width/4;
    int y2 = y + length/4;
    int width2 = width/2;
    int length2 = length/2;
    //This shows the x and y start of for the White Ball
    //The calculations above make sure that the White ball is in the center of the black
    
    g.setColor (Color.black);
    g.fillOval (x, y, width, length);
    
    g.setColor (Color.white);
    g.fillOval (x2, y2, width2, length2);
    
    g.setColor(Color.black);
    g.setFont(new Font("Futura", Font.PLAIN, 60)); 
    g.drawString("Welcome to Magic 8 Ball", 180, 100);
    g.setFont(new Font("Helvetica", Font.BOLD, 100)); 
    String answer = "8";
    g.drawString(answer, x2 + 100, 475);
    //This places the number 8 in the center of the white ball
    
  }
  public static void main (String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new Ball8());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1030,800);
    frame.setVisible(true);
    System.out.println("\n\t\t\t\t     What is your question");
    System.out.println("\t\t---------------------------------------------------------------\n");
    for (int i= 0; i < 30; i++) {
       Scanner scan = new Scanner(System.in);
       
       Random number = new Random();
       
       int random = number.nextInt(19)+1;
       
       String question = scan.nextLine();
  
       if (question.length() > 37) {
           int decrease = question.length()-37;
           System.out.print("Ask a shorter question! Your question length is " + question.length());
           System.out.println(". It needs to be " + decrease + " characters shorter.\n\n");
        }
        //This statement had to be the first "if" so that the random number generator won't override this
       else if (question.equalsIgnoreCase("Will Vamsi get a 100 on his project")) {
           System.out.println("Of course! This is an amazing project and he worked hard\n\n");
        }
       else if (random == 1) {
           System.out.println("As I see it, yes\n\n");
        }
       else if (random == 2) {
           System.out.println("Yeah, maybe\n\n");
        }
       else if (random == 3) {
           System.out.println("1000000% Percent\n\n");
        }
       else if (random == 4) {
           System.out.println("If you want the answer to be yes, you die\n\n");
        }
       else if (random == 5) {
           System.out.println("Mrs. Sitffler said yes\n\n");
        }
       else if (random == 6) {
           System.out.println("That's what she said\n\n");
        }
       else if (random == 7) {
           System.out.println("In my humble opinion I can confer that my brain is processing an answer of yes\n\n");
        }
       else if (random == 8) {
           System.out.println("That is going on the tile\n\n");
        }
       else if (random == 9) {
           System.out.println("BIG FAT NO\n\n");
        }
       else if (random == 10) {
           System.out.println("Yes, is that what you want to hear\n\n");
        }
       else if (random == 11) {
           System.out.println("Maybe\n\n");
        }
       else if (random == 12) {
           System.out.println("Without a Doubt\n\n");
        }
       else if (random == 13) {
           System.out.println("Signs point to yes\n\n");
        }
       else if (random == 14) {
           System.out.println("Bruhhhh, what did you say?\n\n");
        }
       else if (random == 15) {
           System.out.println("You're so annoying, leave me alone\n\n");
        }
       else if (random == 16) {
           System.out.println("Is that even English, ask again\n\n");
        }
       else if (random == 17) {
           System.out.println("Huh? Ask again\n\n");
        }
       else if (random == 18) {
           System.out.println("No habla inglés\n\n");
        }
       else if (random == 19) {
           System.out.println("Whatever you think\n\n");
        }
     }
  }
}





