import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("BOT");
        frame.setBackground(Color.black);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, Constants.screenWidth, Constants.screenHeight);
        frame.setVisible(true);

        CardLayout layout = new CardLayout();
        Container sContainer = frame.getContentPane();
    }

}

