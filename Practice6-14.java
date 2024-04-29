import java.util.Scanner;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("请输入月份的英语表达。");
        System.out.println("另外，首字母大写，之后的字母都小写。");

        String[] month = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"
        };
        
        int monnum = 0; String ans = "month"; int retry = 0; int lastmon = 0;
        do {
            retry = 0;
            do {
                monnum = rand.nextInt(12);
            } while (monnum == lastmon);
            
            while (true) {
                System.out.print(monnum + 1 + "月：");
                ans = stdIn.next();
                if (month[monnum].equals(ans)) break;
                System.out.println("回答错误。");
            }
            System.out.print("回答正确。再来一次？1...Yes / 0...No");
            retry = stdIn.nextInt();
            lastmon = monnum;
        } while (retry == 1);
    }
}
