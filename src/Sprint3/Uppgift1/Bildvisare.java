package Sprint3.Uppgift1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bildvisare extends JFrame implements ActionListener {

    JButton button = new JButton("Nästa bild");
    String directoryPath = "src/Sprint3/Uppgift1/Images";
    ImageIcon image1 = new ImageIcon("src/Sprint3/Uppgift1/Images/90504610_p0_master1200.jpg");
    ImageIcon image2 = new ImageIcon("src/Sprint3/Uppgift1/Images/91196627_p0_master1200.jpg");
    JLabel label = new JLabel(image1);

    Bildvisare() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        this.add(panel);
        button.addActionListener(this);
        panel.add(label);
        panel.add(button);
        this.pack();
        this.setTitle("Best Program Ever");
        this.setSize(1000,1000);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if (isSameIcon(label, image1)){
            label.setIcon(image2);
        } else if (isSameIcon(label, image2)){
            label.setIcon(image1);
        }
    }

    public boolean isSameIcon(JLabel label, ImageIcon image){
        ImageIcon currentIcon = (ImageIcon) label.getIcon();
        return currentIcon == image;
    }

    public static void main(String[] args){
        Bildvisare _ = new Bildvisare();
    }
}
