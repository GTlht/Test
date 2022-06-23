package demo01;

import java.util.Scanner;

public class zuoye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int member;
		do {
		System.out.println("请输入会员号<4位整数>：");
		member=scan.nextInt();
		if(999<member&&member<9999) {
			break;
		}else
		{System.out.println("**输入不合法,必须位四位整数！"
				+ "请重新输入**");
		
		}
		}while(true);
		System.out.println("请输入生日<用两位数表示>：");
		String birthday=scan.next();
		System.out.println("请输入积分：");
		int integral=scan.nextInt();
		System.out.println("已录入的会员信息是：");
        System.out.println("会员名"+"    "+"生日"+"    "+"积分");
        System.out.println(member+"   "+birthday+"   "+integral);
	}

}
