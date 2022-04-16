package lambdaExpression;

import java.util.Scanner;

interface Lambdafunc{
	public void func(int n);
}

interface Lambda{
	boolean func(int n);
}


class MyClass{
	boolean funca(int b) {
		int a=b;
		int ans=0;
		int rem=0;
		while(b!=0) {
			rem=b%10;
			b/=10;
			ans=ans*10+rem;
		}
		if(ans==a) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class LambdaExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		//System.out.println(x);
		Lambdafunc palindrome = (b)->{
			int a=b;
			int ans=0;
			int rem=0;
			while(b!=0) {
				rem=b%10;
				b/=10;
				ans=ans*10+rem;
			}
			if(ans==a) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
		};
		//palindrome.func(x);
	
		
		MyClass mc = new MyClass();
		Lambda palin = mc::funca;
		if(palin.func(x)) {
			System.out.println(x + " is palindrome");
		}else {
			System.out.println(x + " is not palindrome");
			
		}
		
	}

}
