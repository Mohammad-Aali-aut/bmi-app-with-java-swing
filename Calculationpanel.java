import java.awt.*;
import javax.swing.*;

public class Calculationpanel extends JPanel{
    public Calculationpanel(CardLayout cardLayout, JPanel mainPanel){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);    
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("height (cm):"), gbc);

        gbc.gridy = 1;
        JTextField heightField = new JTextField(15);
        add(heightField, gbc);
        gbc.gridy = 2;
        add(new JLabel("weight (kg):"), gbc);
        gbc.gridy = 3;
        JTextField weightField = new JTextField(15);
        add(weightField, gbc);
        gbc.gridy = 4;
        JButton calculateButton = new JButton("calculate your bmi");
        add(calculateButton, gbc);
        gbc.gridy = 5;
        JLabel resultLabel = new JLabel("");
        add(resultLabel, gbc);
        gbc.gridy = 6;
        JButton backButton = new JButton("back");
        add(backButton, gbc);

        calculateButton.addActionListener(e -> {
            String heightText = heightField.getText().trim();
            String weightText = weightField.getText().trim();
            if (heightText.isEmpty() || weightText.isEmpty()){
                JOptionPane.showMessageDialog(
                        mainPanel,
                        "please enter both fields",
                        "error",
                        JOptionPane.ERROR_MESSAGE
                );
            } 
            else{
                double height = Double.parseDouble(heightText);
                double weight = Double.parseDouble(weightText);
                double bmi = weight/((height/100)*(height/100));
                String status = "";
                if (bmi<18.5){
                    status = "underweight";
                        resultLabel.setForeground(Color.BLUE);
                } 
                else if (bmi<25){
                    status = "healthy weight";
     
                    resultLabel.setForeground(Color.GREEN);
                } 
                else if (bmi<30){
                    status = "overweight";
                    resultLabel.setForeground(Color.ORANGE);
                } 
                else{
                    status = "obese";
                    resultLabel.setForeground(Color.RED);
                }

    
                resultLabel.setText("your bmi: " + bmi + " " + status);
            }
        });

    
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "welcome"));
    }
}