package chap12;
// Practice12-2
public class Practice12_2 {
    // 谁的可用余额更多呢
    static int compBalance(TimeAccount a, TimeAccount b) {
        if (a.getBalance() + a.getTimeBalance() > b.getBalance() + b.getTimeBalance())        // a更多
            return 1;                               
        else if (a.getBalance() + a.getTimeBalance() < b.getBalance() + b.getTimeBalance())   // b更多
            return -1;                              
        return 0;                                   // a和b相同
    }

    public static void main(String[] args) {
        TimeAccount adachi = new TimeAccount("足立幸一", "123456", 1000, 200);
        TimeAccount nakata = new TimeAccount("中田真二", "654321", 200, 500);
        
        switch (compBalance(adachi, nakata)) {
            case  0: System.out.println("足立和仲田的可用余额相同");  break;
            case  1: System.out.println("足立的可用余额更多。");  break;
            case -1: System.out.println("仲田的可用余额更多。");  break;
        }
    }
}
