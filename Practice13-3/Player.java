package chap12.player;

public abstract class Player {
    private String[] gestures = {"石头", "布", "剪刀"};
    public abstract String toString();
    public abstract String gesture();
    public void print() {
        System.out.print(toString() + ' ');
        System.out.println(gesture());
    }
    public String[] getGestures() { return gestures; }
}
