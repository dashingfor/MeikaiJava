package chap12.player;

import java.util.Scanner;

public class HumanPlayer extends Player {
    HumanPlayer() { }
    public String toString() {
        return "HumanPlayer";
    }
    public String gesture() {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("选择要出的手势：1···石头/2···布/3···剪刀");
        int choice = stdIn.nextInt() - 1;
        return getGestures()[choice];
    }
}
