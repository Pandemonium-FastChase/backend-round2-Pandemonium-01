import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long balance = 0;
        long output;
        boolean loop = true;

        while (loop) {
            System.out.println("欢迎！请选择您要进行的操作：1.存款; 2.取款; 3.查询余额; 4.退出");
            char choose = scanner.next().charAt(0);
            System.out.println();

            switch (choose) {
                case '1':
                    System.out.println("请输入存款金额：");
                    balance += scanner.nextLong();
                    System.out.println();
                    System.out.println("当前余额：" + balance);
                    System.out.println();
                    break;
                case '2':
                    System.out.println("请输入取款金额：");
                    output = scanner.nextLong();
                    System.out.println();
                    if (output > balance) {
                        System.out.println("余额不足！");
                        System.out.println();
                    } else {
                        balance -= output;
                        System.out.println("取款成功！当前余额：" + balance);
                        System.out.println();
                    }
                    break;
                case '3':
                    System.out.println("当前余额：" + balance);
                    System.out.println();
                    break;
                case '4':
                    System.out.println("谢谢使用！");
                    System.out.println();
                    loop = false;
                    break;
                default:
                    System.out.println("请输入数字1、2、3或4以代表您的选择！");
                    System.out.println();
                    break;

            }
        }
    }
}
