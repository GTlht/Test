package demo01;

import java.util.Scanner;

public class text02 {
public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("请输入整数 a：");
       int a=scan.nextInt();
       System.out.println("请输入整数 b ：");
       int b=scan.nextInt();
       if(a%b==0||a+b>1000)
       {
    	   System.out.println(a);
       }else {
    	   System.out.println(b);
       }
}

}
