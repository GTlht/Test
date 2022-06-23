package demo01;

import java.util.Scanner;

public class zuoye03 {
	static String user = "*";
	static int password = -2;
	static int cardNumber = -1;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		do {
			menu();
			System.out.println("请选择菜单：");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				register();// 注册
				break;
			case 2:
				if (judge(password)) {
					break;
				} else {
					signIn();// 登录
					break;
				}

			case 3:
				if (judge(cardNumber)) {
					break;
				} else {
					prize();// 抽奖
					break;
				}

			default:
				System.out.println("输入错误！请重新输入！");
				continue;
			}

			System.out.println("\n是否继续？(y/n)");
			char flas4 = scan.next().charAt(0);
			if (flas4 == 'y') {
				continue;
			} else {
				break;
			}
		} while (true);
		System.out.println("系统推出，感谢使用！");

	}

	// 菜单
	public static void menu() {
		System.out.println("*****欢迎进入奖客富翁系统*****");
		System.out.println("        1.注册\n" + "        2.登录\n        " + "3.抽奖");
		System.out.println("*****************************");
	}

	// 注册
	public static void register() {
		System.out.println("[奖客富翁系统>注册\n");
		cardNumber = (int) (Math.random() * (9999-1000+1)+1000);
		System.out.println("请填写个人注册信息：");
		System.out.println("用户名：");
		Scanner scan = new Scanner(System.in);
		user = scan.next();
		System.out.println("密码：");
		password = scan.nextInt();
		System.out.println("注册成功，请记住你的会员卡号：");
		System.out.println("用户名       密码      会员卡号");
		System.out.println(user + "    " + password + "    " + cardNumber);

	}

	// 登录
	public static void signIn() {
		System.out.println("[奖客富翁系统>登录\n");
		boolean flase = true;
		int count = 3;
		do {
			System.out.println("用户名：");
			Scanner scan = new Scanner(System.in);
			String users = scan.next();
			System.out.println("密码：");
			long passwords = scan.nextLong();

			if (user.equals(users) && password == passwords) {
				System.out.println("**************");
				System.out.println("欢迎您：" + user);
				System.out.println("**************");
				break;
			} else {
				count--;
				System.out.println("用户名或密码错误，你还有" + count + "次机会！");

			}

			if (count == 0) {
				flase = false;
			}
		} while (flase);
		return;
	}

	// 抽奖
	public static void prize() {
		System.out.println("[奖客富翁系统>抽奖\n");
		System.out.println("你的卡号是：" + cardNumber);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * (9999-1000+1)+1000);
		}
		System.out.print("今天的幸运数字是： ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + "  ");
		}
		int j;
		for (j = 0; j < 5; j++) {
			if (arr[j] == cardNumber) {
				System.out.println("恭喜你中奖了！");
				break;
			}
		}
		if (j == 5) {
			System.out.println("\n很遗憾！你与大奖擦肩而过！");
		}
		return;
	}

	public static boolean judge(int list) {
		if (list == -2) {
			System.out.println("请先注册再登录！");
			return true;
		}
		if (list == -1) {
			System.out.println("请先登录再参与抽奖！");
			return true;
		}
		return false;
	}

}
