import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouseswing extends JFrame {

    private JLabel label;

    public mouseswing() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Perform mouse actions here", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        add(label, BorderLayout.CENTER);

        // Add mouse listeners using adapter classes
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse Moved to: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            mouseswing frame = new mouseswing();
            frame.setVisible(true);
        });
    }
}