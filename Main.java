import java.awt.*;
import javax.swing.*;

public class Main{
    public static void main(String[] args) {
    JFrame frame = new JFrame("BMI App");
    frame.setSize(400, 450); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CardLayout cardLayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardLayout);
    Welcomepanel welcomePanel = new Welcomepanel(cardLayout, mainPanel);
    Calculationpanel calculationPanel = new Calculationpanel(cardLayout, mainPanel);
    Settingpanel settingsPanel = new Settingpanel(cardLayout, mainPanel, welcomePanel, calculationPanel);
  
    mainPanel.add(welcomePanel, "welcome");
    mainPanel.add(calculationPanel, "calculation");
    mainPanel.add(settingsPanel, "settings");

    frame.add(mainPanel);
    frame.setVisible(true);
    }
}