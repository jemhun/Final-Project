import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Offense extends Container {
    private JPanel offenseWin;

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Offensive Players");
        frame.setContentPane(new Offense().offenseWin);
        frame.setPreferredSize(new Dimension(450, 300));
        frame.pack();
        frame.setVisible(true);

    }
}