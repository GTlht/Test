package demo01;

import java.util.Scanner;

public class zuoye02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入会员积分：");
		int integral=scan.nextInt();
		if(integral<2000) {
			System.out.println("该会员享受的折扣是：0.9");
		}else if(integral>=2000&&integral<4000){
			System.out.println("该会员享受的折扣是：0.8");
		}else if(integral>=4000&&integral<8000) {
			System.out.println("该会员享受的折扣是：0.7");
		}else {
			System.out.println("该会员享受的折扣是：0.6");
		}
	}

	
}
