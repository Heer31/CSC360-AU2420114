import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the square
        g.drawRect(200, 150, 100, 100);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            // Create the window
            JFrame frame = new JFrame("Java 2D - Square");

            // Add the drawing panel
            frame.add(new Square());

            // Set window size
            frame.setSize(600, 500);

            // Close the program when the window is closed
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Display the window
            frame.setVisible(true);
        });
    }
}
