package Threding;

public class Thread1 {
	public static void main(String[]args) {
		
		One a = new One(1);
		One b = new One(2);
		One c = new One(3);
		One d = new One(4);
		a.start();
		b.start();
		c.start();
		d.start();	
	
	}
}

class One extends Thread{
	int x;
	One(int x){
		this.x=x;
	}
	public void run() {
		if(x==1) {
			int sum=0;
			
			for(int i=1;i<=2500;i++) {
				sum+=i;
				
			}
			System.out.println(sum);
		}
		else if(x==2) {
			for(int i=100;i<=10000;i++) {
				if(i%2==1) {
					System.out.println("odd: "+i);
				}
			}
		}
		else if(x==3) {
			for(int i=1;i<=5000;i++) {
				if(i%2==0) {
					System.out.println("even: "+i);
				}
			}
		}
		else if(x==4) {
			for(int i=1900;i<=3000;i++) {
				if(i%4==0 && i%100==4) {
					System.out.println("leap year: "+i);
				}
			}
		}
	}
}
