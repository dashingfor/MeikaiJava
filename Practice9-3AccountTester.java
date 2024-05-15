// 用于测试银行账户类【第2版】的类
public class AccountTester {
    public static void main(String[] args) {
        // 足立的账户
        Account adachi = new Account("足立幸一", "123456", 1000, new Day(2000, 1, 2));   // 在原有基础上增加了开户日期
        // 仲田的账户
        Account nakata = new Account("仲田真二", "654321", 200, new Day(2001, 2, 3));

        adachi.withdraw(200);     // 足立取了200日元
        nakata.deposit(100);       // 仲田存了100日元

        // System.out.println("◾️足立的账户");
        // System.out.println(" 账户名：" + adachi.getName());
        // System.out.println(" 账号：" + adachi.getNo());
        // System.out.println(" 可用余额：" + adachi.getBalance());

        // System.out.println("◾️仲田的账户");
        // System.out.println(" 账户名：" + nakata.getName());
        // System.out.println(" 账号：" + nakata.getNo());
        // System.out.println(" 可用余额：" + nakata.getBalance());

        System.out.println(nakata);
        System.out.println(adachi);
    }
}
