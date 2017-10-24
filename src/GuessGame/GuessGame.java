package GuessGame;

import javax.swing.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;


class GuessGame {
    private final String BEST_SCORE_FILE = "./best_score.txt";
    private Integer bestScore = 0;

    private void writeBestScore(){
        try {
            FileOutputStream fout = new FileOutputStream(this.BEST_SCORE_FILE);
            fout.write(this.bestScore);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readBestScore(){
        Integer score = 0;
        try {
            FileInputStream fin = new FileInputStream(this.BEST_SCORE_FILE);
            score = fin.read();
            fin.close();
        }
        catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        this.bestScore = score;
    }

    void play(int max){
        int randomNum = ThreadLocalRandom.current().nextInt(0, max + 1);
        int triesCount = 0;

        do {
            triesCount++;
            Integer currentGuess = Integer.parseInt(JOptionPane.showInputDialog("What will you say this time, hooman?"));
            System.out.println("Your choice: " + currentGuess);
            if (currentGuess < randomNum) {
                System.out.println("Hehehe, not this time. My number is bigger than yours!!!!");
            }
            else if (currentGuess > randomNum) {
                System.out.println("Do you really wanna win? You have no chances... Try something smaller next time.");
            }
            else {
                System.out.println("Oh my God! You won! Go and try your luck in a lottery!");
                Integer currentScore = new Double(max / triesCount).intValue();
                System.out.println("Your score: " + currentScore);
                if (currentScore > this.bestScore) {
                    this.bestScore = currentScore;
                    this.writeBestScore();
                }
                break;
            }
        }
        while (true);
    }

    void printBestScore() {
        System.out.println("Best score: " + this.bestScore);
    }

    public GuessGame() {
        this.readBestScore();
    }
}
