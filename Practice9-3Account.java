// 银行账户类【第2版】
public class Account {
    private String name;    // 账户名
    private String no;      // 账号
    private long balance;   // 可用余额
    private Day openDay;    // 开户日期

    //--- 构造函数 ---//
    public Account(String n, String num, long z, Day openDay) {
        name = n;       // 账户名
        no = num;       // 账号
        balance = z;    // 可用余额
        this.openDay = new Day(openDay);  // 开户日期
    }

    //--- 确认账户名 ---//
    public String getName() {
        return name;
    }

    //--- 确认账号 ---//
    public String getNo() {
        return no;
    }

    //--- 确认可用余额 ---//
    public long getBalance() {
        return balance;
    }

    //--- 存入k日元 ---//
    public void deposit(long k) {
        balance += k;
    }

    //--- 取出k日元 ---//
    public void withdraw(long k) {
        balance -= k;
    }

    //--- 确认开户日期 ---//
    public Day getOpenDay() {
        return new Day(openDay);
    }

    //--- 返回字符串表示 ---//
    public String toString() {
        return String.format("账户名：%s\n账号：%s\n可用余额：%3d\n开户日期：%s\n", name, no, balance, openDay);
    }
}
