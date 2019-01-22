package Test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入带字母的字符串：");
        boolean b=false;
        while (true){
            int count=0;

            String str = scanner.next();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if ((chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z')){
                    b=true;
                }
            }
            if (b){
                for (int i = 0; i < chars.length; i++) {
                    count++;
                }
                System.out.println("输入的字符串中含大写字母"+count+"个");
                break;
            }else {
                System.out.println("输入错误，请重新输入带字母的字符串");
            }
        }
    }
}
