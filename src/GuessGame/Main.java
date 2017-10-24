package GuessGame;

import javax.swing.*;


public class Main {
    public static void main(final String[] args){
        int max = Integer.parseInt(JOptionPane.showInputDialog("Please input max number"));
        System.out.println("Max number:" + max);
        GuessGame game = new GuessGame();
        game.play(max);
        game.printBestScore();
    }
}
