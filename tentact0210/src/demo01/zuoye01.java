package demo01;

import java.util.Scanner;

public class zuoye01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int random=(int)(Math.random()*10);
		System.out.println("#"+random+"#");
		System.out.println("我行我素购物管理系统>幸运抽奖");
		System.out.println("请输入会员号<4位整数>：");
		int member=scan.nextInt();
		int num=member/100%10;
          if(random==num) {
        	  System.out.println(member+"是幸运客户，"
        	  		+ "获得精美MP3一个");
          }else {
        	  System.out.println(member+"谢谢你的支持！");
          }
	}

}
