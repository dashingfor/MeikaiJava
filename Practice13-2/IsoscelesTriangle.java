package chap12.shape2;

public abstract class IsoscelesTriangle extends Shape {
    private int legLength;
    public IsoscelesTriangle(int legLength) {
        setLegLength(legLength);
    }
    public int getLegLength() { return legLength; }
    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }
    public String toString() {
        return "IsoscelesTriangle(legLength:" + legLength + ")";
    }
}
