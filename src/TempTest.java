import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * This method is used for whatever testing you may need to perform :)
 *
 * Created by sketch204 on 2016-05-10.
 */
public class TempTest {
    public TempTest () {
        testing1 ();
    }

    public void testing2 () {
        JTextField jtf = new JTextField(" ");
        jtf.setVisible(true);
        System.out.println(jtf.getColumns());
    }

    public void testing1 () {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File ("src/pictures/Chicken-Brown.png.png"));
        } catch (IOException e) {}

        JFrame frame = new JFrame ("I'm testing!");
        frame.setSize(1280, 720);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

//        frame.add (new JButton ("This is text", new ImageIcon("src/pictures/Chicken-Brown.png")));
        JButton button = new JButton("I'm a button");

        button.setBackground(Color.yellow);
        button.setOpaque(true);
        button.setBorderPainted(false);

        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TempTest();
    }
}
