package Extra;

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

public class Main {

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

//another code

package Threading;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Student s1 = new Student("milli","11","2020");
		Student s2 = new Student("sidra","11","2021");
		System.out.println(s1);
		System.out.println(s2);
		A a = new A(){	public void pqr() {
			System.out.println("hello world");
		}
	};
		
		a.pqr();
	}

}
class Student{
	String name;
	int roll;
	int Year;
	Student(String name,String roll,String Year){
		this.name=name;
		this.roll=Integer.parseInt(roll);
		this.Year=Integer.parseInt(Year);
	}
	public void print() {
		System.out.println("hello world");
	}
	public String toString() {
		String str;
		str="\nROLL: "+roll+" "+"\nNAME: "+name+"\nYear: "+Year;
		return str;
	}
	

	//a.pqr();
}
interface xyz{
	public void pqr();
}
class A implements xyz{

	@Override
	public void pqr() {
		// TODO Auto-generated method stub
		
	}
	
}
