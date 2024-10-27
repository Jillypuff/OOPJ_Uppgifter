package Sprint3.Uppgift2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuelCalculator extends JFrame implements ActionListener {

    JLabel prompt1 = new JLabel("Ange mätarställning nu: ");
    JLabel prompt2 = new JLabel("Ange mätarställning för ett år sedan:");
    JLabel prompt3 = new JLabel("Ange antal liter förbrukad bensin: ");
    JTextField answer1 = new JTextField();
    JTextField answer2 = new JTextField();
    JTextField answer3 = new JTextField();

    JLabel prompt4 = new JLabel("Antal körda mil: ");
    JLabel prompt5 = new JLabel("Antal liter bensin: ");
    JLabel prompt6 = new JLabel("Förbrukning per mil: ");

    JLabel result4 = new JLabel("0.0");
    JLabel result5 = new JLabel("0.0");
    JLabel result6 = new JLabel("0.0");

    JPanel panel = new JPanel(new BorderLayout());
    JPanel top = new JPanel(new GridLayout(3,2));
    JPanel bottom = new JPanel(new GridLayout(1,6));

    int currentMilage = -1;
    int milageOneYearAgo = -1;
    int fuelUsed = -1;

    FuelCalculator() {
        top.add(prompt1);
        top.add(answer1);
        top.add(prompt2);
        top.add(answer2);
        top.add(prompt3);
        top.add(answer3);

        bottom.add(prompt4);
        bottom.add(result4);
        bottom.add(prompt5);
        bottom.add(result5);
        bottom.add(prompt6);
        bottom.add(result6);

        panel.add(top, BorderLayout.NORTH);
        panel.add(bottom, BorderLayout.SOUTH);

        answer1.addActionListener(this);
        answer2.addActionListener(this);
        answer3.addActionListener(this);

        this.add(panel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == answer1) {
                currentMilage = Integer.parseInt(answer1.getText());
            } else if (e.getSource() == answer2) {
                milageOneYearAgo = Integer.parseInt(answer2.getText());
            } else if (e.getSource() == answer3) {
                fuelUsed = Integer.parseInt(answer3.getText());
            }
        } catch (Exception ex){
            if (e.getSource() == answer1) {
                answer1.setText("");
            } else if (e.getSource() == answer2) {
                answer2.setText("");
            } else if (e.getSource() == answer3) {
                answer3.setText("");
            }
        }
        if (currentMilage > 0 && milageOneYearAgo > 0){
            result4.setText(currentMilage - milageOneYearAgo + "");
        }
        if (fuelUsed > 0){
            result5.setText(fuelUsed + "");
        }
        if (currentMilage > 0 && milageOneYearAgo > 0 && fuelUsed > 0){
            result6.setText((double)fuelUsed/(double)(currentMilage - milageOneYearAgo) + "");
        }
    }

    public static void main(String[] args) {
        new FuelCalculator();
    }
}
