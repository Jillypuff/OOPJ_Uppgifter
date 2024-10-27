package Sprint3.Uppgift6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class F extends JFrame{

    JButton     button1     = new JButton("1");
    JButton     button2     = new JButton("2");
    JTextField  textField1  = new JTextField(5);
    JPanel      mainPanel   = new JPanel(new BorderLayout());

    F(){
        mainPanel.add(button1, BorderLayout.NORTH);
        mainPanel.add(textField1, BorderLayout.CENTER);
        mainPanel.add(button2, BorderLayout.SOUTH);
        addWindowListener(windowListener);
        textField1.addFocusListener(focusListener);
        add(mainPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    WindowAdapter windowListener = new WindowAdapter() {
        @Override
        public void windowActivated(WindowEvent e) {
            textField1.requestFocus();
        }
    };

    FocusListener focusListener = new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            textField1.setBackground(Color.BLUE);
        }

        @Override
        public void focusLost(FocusEvent e) {
            textField1.setBackground(Color.WHITE);
        }
    };

   public static void main(String[] args){
       new F();
   }
}
