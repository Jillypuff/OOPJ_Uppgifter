package Sprint3.Uppgift5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissor extends JFrame implements ActionListener {

    JButton playerRock = new JButton("Rock");
    JButton playerPaper = new JButton("Paper");
    JButton playerScissor = new JButton("Scissor");
    JButton computerRock = new JButton("Rock");
    JButton computerPaper = new JButton("Paper");
    JButton computerScissor = new JButton("Scissor");

    Color defaultColor = playerRock.getBackground();
    Color selectedColor = Color.BLUE;

    JLabel playerScoreLabel = new JLabel("Player Score: 0");
    JLabel computerScoreLabel = new JLabel("Computer Score: 0");

    JLabel gameOutcome = new JLabel("Result");

    JPanel buttonsPanel = new JPanel(new GridLayout(3, 2));
    JPanel scorePanel = new JPanel(new GridLayout(1,2));
    JPanel gameOutcomePanel = new JPanel(new GridLayout(1,1));

    JPanel mainPanel = new JPanel(new BorderLayout());

    int playerScore = 0;
    int computerScore = 0;
    Random random = new Random();

    RockPaperScissor() {
        buttonsPanel.add(playerRock);
        buttonsPanel.add(computerRock);
        buttonsPanel.add(playerPaper);
        buttonsPanel.add(computerPaper);
        buttonsPanel.add(playerScissor);
        buttonsPanel.add(computerScissor);
        computerRock.setEnabled(false);
        computerPaper.setEnabled(false);
        computerScissor.setEnabled(false);

        playerRock.addActionListener(this);
        playerPaper.addActionListener(this);
        playerScissor.addActionListener(this);

        scorePanel.add(playerScoreLabel);
        scorePanel.add(computerScoreLabel);

        gameOutcomePanel.add(gameOutcome);

        mainPanel.add(buttonsPanel, BorderLayout.CENTER);
        mainPanel.add(scorePanel, BorderLayout.NORTH);
        mainPanel.add(gameOutcomePanel, BorderLayout.SOUTH);

        add(mainPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        resetButtonColors();
        int computerMove = random.nextInt(3); // Rock 0, Paper 1, Scissor 2
        int playerMove = -1;
        if (e.getSource() == playerRock) {
            playerMove = 0;
            playerRock.setBackground(selectedColor);
        } else if (e.getSource() == playerPaper) {
            playerMove = 1;
            playerPaper.setBackground(selectedColor);
        } else if (e.getSource() == playerScissor) {
            playerMove = 2;
            playerScissor.setBackground(selectedColor);
        }

        switch (computerMove){
            case 0 -> computerRock.setBackground(selectedColor);
            case 1 -> computerPaper.setBackground(selectedColor);
            case 2 -> computerScissor.setBackground(selectedColor);
        }

        int result = (3 + playerMove - computerMove) % 3;
        switch (result){
            case 0 -> {
                playerScore++;
                gameOutcome.setText("Player win!");
            }
            case 1 -> {
                computerScore++;
                gameOutcome.setText("Computer win!");
            }
            case 2 -> gameOutcome.setText("Draw!");
        }
        updateScores();
    }

    public void updateScores(){
        playerScoreLabel.setText("Player Score: " + playerScore);
        computerScoreLabel.setText("Computer Score: " + computerScore);
    }

    public void resetButtonColors(){
        playerRock.setBackground(defaultColor);
        playerPaper.setBackground(defaultColor);
        playerScissor.setBackground(defaultColor);
        computerRock.setBackground(defaultColor);
        computerPaper.setBackground(defaultColor);
        computerScissor.setBackground(defaultColor);
    }

    public static void main(String[] args) {
        new RockPaperScissor();
    }
}
