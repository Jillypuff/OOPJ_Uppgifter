package Sprint3.Uppgift3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeCalculator extends JFrame implements ActionListener {

    JLabel labelCost = new JLabel("Cost: ");
    JLabel labelPayed = new JLabel("Payed: ");
    JTextField inputCost = new JTextField(1);
    JTextField inputPayed = new JTextField(1);

    JLabel resultThousand = new JLabel("0");
    JLabel resultFiveHundred = new JLabel("0");
    JLabel resultTwoHundred = new JLabel("0");
    JLabel resultHundred = new JLabel("0");
    JLabel resultFifty = new JLabel("0");
    JLabel resultTwenty = new JLabel("0");
    JLabel resultTen = new JLabel("0");
    JLabel resultFive = new JLabel("0");
    JLabel resultTwo = new JLabel("0");
    JLabel resultOne = new JLabel("0");

    JCheckBox thousand = new JCheckBox("1000:");
    JCheckBox fiveHundred =  new JCheckBox("500:");
    JCheckBox twoHundred =  new JCheckBox("200:");
    JCheckBox hundred =  new JCheckBox("100:");
    JCheckBox fifty =  new JCheckBox("50:");
    JCheckBox twenty =  new JCheckBox("20:");
    JCheckBox ten =  new JCheckBox("10:");
    JCheckBox five =  new JCheckBox("5:");
    JCheckBox two =  new JCheckBox("2:");
    JCheckBox one =  new JCheckBox("1:");

    JPanel mainPanel = new JPanel(new BorderLayout());
    JPanel inputPanel = new JPanel(new GridLayout(2,2));
    JPanel changePanel = new JPanel(new GridLayout(5,4));

    int cost = -1;
    int payed = -1;

    ChangeCalculator() {
        inputPanel.add(labelCost);
        inputPanel.add(inputCost);
        inputPanel.add(labelPayed);
        inputPanel.add(inputPayed);
        inputCost.addActionListener(this);
        inputPayed.addActionListener(this);

        changePanel.add(thousand);
        changePanel.add(resultThousand);
        changePanel.add(fiveHundred);
        changePanel.add(resultFiveHundred);
        changePanel.add(twoHundred);
        changePanel.add(resultTwoHundred);
        changePanel.add(hundred);
        changePanel.add(resultHundred);
        changePanel.add(fifty);
        changePanel.add(resultFifty);
        changePanel.add(twenty);
        changePanel.add(resultTwenty);
        changePanel.add(ten);
        changePanel.add(resultTen);
        changePanel.add(five);
        changePanel.add(resultFive);
        changePanel.add(two);
        changePanel.add(resultTwo);
        changePanel.add(one);
        changePanel.add(resultOne);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(changePanel, BorderLayout.CENTER);
        add(mainPanel);
        setTitle("Change Calculator");
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == inputCost){
                cost = Integer.parseInt(inputCost.getText());
            } else if (e.getSource() == inputPayed){
                payed = Integer.parseInt(inputPayed.getText());
            }
        } catch (NumberFormatException ex) {
            if (e.getSource() == inputCost){
                inputCost.setText("");
                cost = -1;
            } else if (e.getSource() == inputPayed){
                inputPayed.setText("");
                payed = -1;
            }
        }
        if (cost > 0 && payed > 0) {
            calculateChange();
        }
    }

    void calculateChange() {
        int change = payed - cost;
        resetChange();
        if (thousand.isSelected()) {
            resultThousand.setText(String.valueOf(change/1000));
            change %= 1000;
        }
        if (fiveHundred.isSelected()) {
            resultFiveHundred.setText(String.valueOf(change/500));
            change %= 500;
        }
        if (twoHundred.isSelected()) {
            resultTwoHundred.setText(String.valueOf(change/200));
            change %= 200;
        }
        if (hundred.isSelected()) {
            resultHundred.setText(String.valueOf(change/100));
            change %= 100;
        }
        if (fifty.isSelected()) {
            resultFifty.setText(String.valueOf(change/50));
            change %= 50;
        }
        if (twenty.isSelected()) {
            resultTwenty.setText(String.valueOf(change/20));
            change %= 20;
        }
        if (ten.isSelected()) {
            resultTen.setText(String.valueOf(change/10));
            change %= 10;
        }
        if (five.isSelected()) {
            resultFive.setText(String.valueOf(change/5));
            change %= 5;
        }
        if (two.isSelected()) {
            resultTwo.setText(String.valueOf(change/2));
            change %= 2;
        }
        if (one.isSelected()) {
            resultOne.setText(String.valueOf(change));
        }
    }

    public void resetChange(){
        resultThousand.setText("0");
        resultFiveHundred.setText("0");
        resultTwoHundred.setText("0");
        resultHundred.setText("0");
        resultFifty.setText("0");
        resultTwenty.setText("0");
        resultTen.setText("0");
        resultFive.setText("0");
        resultTwo.setText("0");
        resultOne.setText("0");
    }

    public static void main(String[] args) {
        new ChangeCalculator();
    }

}
