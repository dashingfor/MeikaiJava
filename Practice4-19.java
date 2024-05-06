import java.util.Scanner;

public class Practice0419 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int retry, month;

        do {
            do {
                System.out.print("计算季节\n请输入月份：");
                month = stdIn.nextInt();
            } while (month < 1 || month > 12);

            if (month >= 3 && month <= 5)
                System.out.println("这是春天。");
            else if (month >= 6 && month <= 8)
                System.out.println("这是夏天。");
            else if (month >= 9 && month <= 11)
                System.out.println("这是秋天。");
            else 
                System.out.println("这是冬天。");

            System.out.print("要重复一次吗？1…Yes/0…No：");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }

}
