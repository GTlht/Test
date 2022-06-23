package demo01;

import java.util.Scanner;

public class text04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("输入年份");
		int year=scan.nextInt();
		System.out.println("输入月份");
		int month=scan.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			if(year%400==0||year%4==0&&year%100!=0) {
				System.out.println("29天");
			}else {
				System.out.println("28天");
			}
			break;
			default:
				System.out.println("月份不合法");
		}
	}

}
