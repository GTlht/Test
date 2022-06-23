package demo01;

import java.util.Scanner;

public class text01 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("输入鸡蛋个数");
	int num=scan.nextInt();
	if(num>5) {
		System.out.println("退货");
	}else {
		System.out.println("吃掉");
	}
	}
	
	}
	

