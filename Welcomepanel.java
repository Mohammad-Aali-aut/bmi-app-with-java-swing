import java.awt.*;
import javax.swing.*;

public class Welcomepanel extends JPanel{
    public Welcomepanel(CardLayout cardLayout, JPanel mainPanel){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel titleLabel = new JLabel("welcome to the bmi calculator");
        add(titleLabel, gbc);

        gbc.gridy = 1;
        JButton startButton = new JButton("start");
        add(startButton, gbc);
        gbc.gridy = 2;
        JLabel nameLabel = new JLabel("created by Mohammad Aali");
        add(nameLabel, gbc);
        gbc.gridy = 3;
        JButton settingsButton = new JButton("settings");
        add(settingsButton, gbc);
        settingsButton.addActionListener(e -> cardLayout.show(mainPanel, "settings"));
        startButton.addActionListener(e -> cardLayout.show(mainPanel, "calculation"));
       
    }

    
}