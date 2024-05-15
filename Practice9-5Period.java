public class Period {
    private Day from;       // 开始日期
    private Day to;         // 结束日期
    private String color;   // 血的颜色（深/正常/浅）
    private String volume;  // 血量（多/正常/少）
    private String texture; // 质地（结块/正常）

    //--- 构造函数 ---//
    public Period(Day from, Day to, String color, String volume, String texture) {
        this.from = new Day(from);
        this.to = new Day(to);
        this.color = color;
        this.volume = volume;
        this.texture = texture;
    }

    public Day getFromDay() {
        return new Day(from);
    }

    public Day getToDay() {
        return new Day(to);
    }

    public String getColor() {
        return color;
    }

    public String getVolume() {
        return volume;
    }

    public String getTexture() {
        return texture;
    }

    //--- 返回字符串 ---//
    public String toString() {
        return String.format("本次生理期从%s开始到%s结束。\n颜色：%s 血量：%s 质地：%s\n", from, to, color, volume, texture);
    }
}
