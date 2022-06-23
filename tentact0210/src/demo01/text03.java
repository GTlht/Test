package demo01;

import java.util.Scanner;

public class text03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score=scan.nextInt();
//		if(score>=90) {
//			System.out.println("成绩优秀");
//		}else if(score>=80) {
//			System.out.println("成绩良");
//		}else if(score>=60) {
//			System.out.println("成绩中等");
//		}else  {
//			System.out.println("成绩差");
//
//	}
		int a=score/10;
		switch(a) {
		case 9:
		case 10:
			System.out.println("优秀哦");
			break;
		case 8:
			System.out.println("良哟");
			break;
		
		case 7:
		case 6:
			System.out.println("中等哟");
            break;
            default:
            	System.out.println("不及格哦");
}
}
}