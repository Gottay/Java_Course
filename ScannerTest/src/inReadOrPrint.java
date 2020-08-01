import java.io.*;

public class inReadOrPrint {
	public static void main(String[] args) {
		char c = ' ';
		System.out.println("请输入一个字符：");
		try {
			c = (char) System.in.read();			
		}catch(IOException e) {}
		System.out.println("刚才输入的字符是：" + c);
	}
}
