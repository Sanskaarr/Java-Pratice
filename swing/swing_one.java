import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class swing_one extends JFrame {

    private JRadioButton redButton;
    private JRadioButton yellowButton;
    private JRadioButton greenButton;
    private ButtonGroup group;
    private JLabel messageLabel;

    public swing_one() {
        // Setup Frame
        setTitle("Traffic Light Simulator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 250);
        setLocationRelativeTo(null); // Center the frame
        setLayout(new BorderLayout());

        // Message Label
        messageLabel = new JLabel();
        messageLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(messageLabel, BorderLayout.NORTH);

        // Radio Buttons Panel
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        add(radioPanel, BorderLayout.CENTER);

        // Radio Buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");
        group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Add Item Listeners to Radio Buttons
        redButton.addItemListener(new ColorSelector(Color.RED, "Stop"));
        yellowButton.addItemListener(new ColorSelector(Color.YELLOW, "Caution"));
        greenButton.addItemListener(new ColorSelector(Color.GREEN, "Go"));

        // Add Radio Buttons to Panel
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);

        // Make the frame visible
        setVisible(true);
    }

    // Inner Class for Handling Radio Button Selection
    private class ColorSelector implements ItemListener {
        private Color color;
        private String message;

        public ColorSelector(Color color, String message) {
            this.color = color;
            this.message = message;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                messageLabel.setText(message);
                messageLabel.setForeground(color);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(swing_one::new);
    }
}
