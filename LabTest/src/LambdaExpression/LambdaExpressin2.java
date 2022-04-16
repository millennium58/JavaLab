package LambdaExpression;
interface Myfunc{
	boolean palin(int n);
}
class Palindrome {
	boolean palindrome(int n) {
		int a=n;
		int ans=0;
		int rem=0;
		while(a!=0) {
			rem=a%10;
			a/=10;
			ans=ans*10+rem;
		}
		if(ans==n) {
			return true;
		}
		else {
			return false;
		}
	}
}



public class LambdaExpressin2 {
	public static void main(String[]args) {
		Palindrome obj =new Palindrome();
		Myfunc pndrome=obj::palindrome;
		int n=121;
		if(pndrome.palin(n)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}

