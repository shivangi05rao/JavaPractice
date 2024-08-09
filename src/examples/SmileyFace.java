package examples;
import javax.swing.*;
import java.awt.*;

public class SmileyFace extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Draw the left eye
        g.setColor(Color.BLACK);
        g.fillOval(100, 120, 40, 40);

        // Draw the right eye
        g.fillOval(160, 120, 40, 40);

        // Draw a smile
        g.drawArc(100, 160, 100, 60, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        SmileyFace smileyFace = new SmileyFace();
        frame.add(smileyFace);

        frame.setVisible(true);
    }
}
