// 日期类【第4版】
import java.util.GregorianCalendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import static java.util.GregorianCalendar.*;
public class Day {
    private int year = 1;      // 年
    private int month = 1;     // 月
    private int date = 1;      // 日
    private static int ty, tm, td;      // 运行程序当天的日期

    //--- y年是闰年吗？ ---//
    public static boolean isLeap(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;      // 类方法
    }

    //--- 调整不合适的值 ---//
    // 参数为月，调整月份
    public static int reMonth(int m) {
        if (m == 0) m = 1;
        if (m == 13) m = 12;
        return m;
    }
    // 参数为年月日，调整日期（引用调整月份的方法）
    public static int reDate(int y, int m, int d) {
        m = reMonth(m);
        if ((m == 4 || m == 6 || m == 9 || m == 11) && d == 31) {
            d = 30;
        }
        if (m == 2) {
            if (isLeap(y) && d == 30) {
                d = 29;
            } else if (!isLeap(y) && d == 29) {
                d = 28;
            }
        }
        return d;
    }

    //--- 确定程序运行当天日期 ---//
    static {
        GregorianCalendar today = new GregorianCalendar();
        ty = today.get(YEAR);
        tm = today.get(MONTH);
        td = today.get(DATE);
    }

    //--- 构造函数 ---//
    public Day(int year) { this.year = year; }
    public Day(int year, int month) { this(year); this.month = reMonth(month); }
    public Day(int year, int month, int date) { this(year, reMonth(month)); this.date = reDate(year, month, date); }
    public Day(Day d) { this(d.year, d.month, d.date); }        // 复制构造函数
    public Day() { this(ty, tm, td); }                          // 没有参数传入时初始化为程序运行当天的日期

    //--- 获取年、月、日 ---//
    int getYear()  { return year; }      // 获取年
    int getMonth() { return month; }     // 获取月
    int getDate()  { return date; }      // 获取日

    //--- 设置年、月、日 ---//
    public void setYear(int year) { this.year = year; }      // 设置年
    public void setMonth(int month) { this.month = reMonth(month); }  // 设置月
    public void setDate(int date) { this.date = reDate(year, month, date); }      // 设置日

    public void set(int year, int month, int date) {         // 设置年月日
        this.year = year;
        this.month = reMonth(month);
        this.date = reDate(year, month, date);
    }

    //--- 是闰年吗？ ---//
    public boolean isLeap() { return isLeap(year); }

    //--- 计算星期 ---//
    public int dayOfWeek() {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    //--- 与日期d相等吗 ---//
    public boolean equalTo(Day d) {
        return year == d.year && month == d.month && date == d.date;
    }
    //--- 判断两个日期的前后关系-类方法 ---//
    public static int relationTo(Day a, Day b) {
        int ay = a.getYear();       int by = b.getYear();     // 分别提取a和b的年月日
        int am = a.getMonth();      int bm = b.getMonth();
        int ad = a.getDate();       int bd = b.getDate();
        if (ay > by)
            return 0;               // a在b之后
        else if (ay < by)
            return 1;               // a在b之前
        else if (am > bm)
            return 0;
        else if (am < bm)
            return 1;
        else if (ad > bd)
            return 0;
        else if (ad < bd)
            return 1;
        else 
            return 2;               // a和b相同
    }
    //--- 判断与其它日期的前后关系-实例方法 ---//  
    public int relationTo(Day a) {
        return relationTo(a, new Day(year, month, date));  // 输入的日期a比实例日期晚的话返回0，早返回1，相同返回2.
    }
    //--- 计算这一年过去的天数 ---//
    public int pastDays() {
        int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
        int pstdays = date;
        for (int i = 0; i < month - 1; i++) {
            pstdays += daysOfMonth[i];
        }
        if (isLeap(year) && relationTo(new Day(year, 2, 28)) != 0) pstdays += 1;
        return pstdays;
    }
    //--- 计算这一年剩余的天数 ---//
    public int daysLeft() {
        if (isLeap(year))
            return 366 - pastDays();
        else
            return 355 - pastDays();
    }
    //--- 将日期推后一天 ---//
    public void forwardaDay() {
        date += 1;
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && date > 31) {
            month += 1;
            date = 1;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
            month += 1;
            date = 1;
        } else if (month == 12 && date > 31) {
            year = 1;
            month = 1;
            date = 1;
        } else if (month == 2) {
            if (isLeap(year) && date > 29) {
                month += 1;
                date = 1;
            } else {
                month += 1;
                date = 1;
            }
        }
    }
    //--- 返回后一天日期 ---//
    public Day forwardaDayNew() {
        forwardaDay();
        return new Day(year, month, date);
    }
    //--- 将日期倒退一天 ---//
    public void backAday() {
        // 普通日期
        date -= 1;
        // 跨月
        if (date == 0) {
            // 跨年
            if (month == 1) {
                year -= 1;
                month = 12;
                date = 31;
              // 普通跨月
            } else if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
                month -= 1;
                date = 31;
            } else if (month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                month -= 1;
                date = 30;
              // 2月
            } else if (month == 3) {
                if (isLeap(year)) {
                    month -= 1;
                    date = 29;
                } else {
                    month -= 1;
                    date = 28;
                }
            }
        }
    }
    //--- 返回前一天日期 ---//
    public Day backANewDay() {
        backAday();
        return new Day(year, month, date);
    }
    //--- 将日期推后n天 ---//
    public void forwardNDay(int n) {
        // 普通推后
        date += n;
        // 跨月
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && date > 31) {
            month += 1;
            date -= 31;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
            month += 1;
            date -= 30;
            // 跨年
        } else if (month == 12 && date > 31) {
            year += 1;
            month = 1;
            date -= 31;
            // 2月
        } else if (month == 2) {
            if (isLeap(year) && date > 29) {
                month += 1;
                date -= 29;
            } else {
                month += 1;
                date -= 28;
            }
        }
    }
    //--- 返回n天后的日期 ---//
    public Day forwardNDayNew(int n) {
        forwardNDay(n);
        return new Day(year, month, date);
    }
    //--- 将日期倒退n天 ---//
    public void backNDays(int n) {
        for (int i = 0; i < n; i++) {
            backAday();
        }
    }
    //--- 返回n天前的日期 ---//
    public Day backNDaysNew(int n) {
        backNDays(n);
        return new Day(year, month, date);
    }
    //--- 返回字符串表示 ---//
    public String toString() {
        String[] wd = {"日", "一", "二", "三", "四", "五", "六"};
        return String.format("%04d年%2d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
    }
}
