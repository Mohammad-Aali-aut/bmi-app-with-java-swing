import java.awt.*;
import javax.swing.*;

public class Settingpanel extends JPanel{
    private JPanel welcomePanel;
    private JPanel calculationPanel;
    private JPanel mainPanel;

    public Settingpanel(CardLayout cardLayout, JPanel mainPanel, JPanel welcomePanel, JPanel calculationPanel){
        this.mainPanel = mainPanel;
        this.welcomePanel = welcomePanel;
        this.calculationPanel = calculationPanel;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel titleLabel = new JLabel("settings");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18)); 
        add(titleLabel, gbc);

        gbc.gridy = 1;
        JButton lightModeBtn = new JButton("light Mode");
        add(lightModeBtn, gbc);

        gbc.gridy = 2;
        JButton darkModeBtn = new JButton("dark Mode");
        add(darkModeBtn, gbc);

        gbc.gridy = 3;
        JButton backBtn = new JButton("back");
        add(backBtn, gbc);

        lightModeBtn.addActionListener(e -> {
            mainPanel.setBackground(Color.WHITE);
            this.setBackground(Color.WHITE);
            welcomePanel.setBackground(Color.WHITE);
            calculationPanel.setBackground(Color.WHITE);
            JOptionPane.showMessageDialog(this, "light mode applied.");
        });

       
        darkModeBtn.addActionListener(e -> {
         
            mainPanel.setBackground(Color.BLACK);
            this.setBackground(Color.BLACK);
            welcomePanel.setBackground(Color.BLACK);
            calculationPanel.setBackground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "dark mode applied.");
        });

        backBtn.addActionListener(e -> cardLayout.show(mainPanel, "welcome"));
    }
}