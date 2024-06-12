package chap12.player;

import java.util.Scanner;

public class PlayerTest {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("人类玩家数：");
        int humanN = stdIn.nextInt();
        System.out.print("电脑玩家数：");
        int computerN = stdIn.nextInt();
        
        Player[] p = new Player[humanN + computerN];
        for (int i = 0; i < humanN + computerN; i++) {
            if (i < humanN) p[i] = new HumanPlayer();
            else p[i] = new ComputerPlayer();
        }
        for (Player a : p) {
            a.print();
            System.out.println();
        }
    }
}
