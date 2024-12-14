import javax.swing.*;

public class exam{
    private JLabel label;

    exam(){
        JFrame frame = new JFrame();

        label = new JLabel("Welcome to the examination!");
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
