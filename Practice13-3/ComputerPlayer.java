package chap12.player;
import java.util.Random;
public class ComputerPlayer extends Player {
    ComputerPlayer() { }
    public String toString() {
        return "ComputerPlayer";
    }
    public String gesture() {
        Random rand = new Random();
        return getGestures()[rand.nextInt(3)];
    }
}
