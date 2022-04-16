package Threding;



public class Threading1 {
	public static void main(String[]args) {
		
			Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				int sum=0;
				
				for(int i=1;i<=2500;i++) {
					sum+=i;
				
			}
				System.out.println("sum is : "+sum);
			}
		}) ;
	
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=100;i<=10000;i++) {
					if(i%2==1) {
						System.out.println("odd: "+i);
					}
				}
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=2000;i++) {
					if(i%2==0) {
						System.out.println("even: "+i);
					}
				}
			}
		});
		Thread t4 = new Thread(new Runnable() {
			public void run() {
				for(int i=1900;i<=3000;i++) {
					if(i%4==0 && i%100==4) {
						System.out.println("leap year: "+i);
					}
				}
			}
		});
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




