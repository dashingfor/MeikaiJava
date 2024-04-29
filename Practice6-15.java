import java.util.Scanner;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("请用小写输入英文的星期名。");
        
        String[] week = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        String[] weekchar = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};

        String retry = "Yes"; int lstday = 8, weeknum; String ansretry;
        do {
            ansretry = "No";
            do {
                weeknum = rand.nextInt(7);
            } while (weeknum == lstday);
            while (true) {
                System.out.print(weekchar[weeknum] + ":");
                String ans = stdIn.next();
                if (week[weeknum].equals(ans)) break;
                System.out.println("回答错误。");
            }
            System.out.println("回答正确。再来一次？Yes/No");
            ansretry = stdIn.next();
            lstday = weeknum;
        } while (retry.equals(ansretry));
    }
}
