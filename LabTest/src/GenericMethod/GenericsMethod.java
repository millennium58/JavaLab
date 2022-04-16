package GenericMethod;

public class GenericsMethod {

	public static void main(String[] args) {
		Gen <String> s = new Gen<String>();
		if(s.Sample("01234")==null) {
			System.out.println("we can't convert it");
		}
		else {
			System.out.println("can convert it");
		}

	}

}


class Gen<T extends String>{
	T str;
	 T Sample(T str) {
		 int cnt=0;
		 this.str=str;
		 for(int i=0;i<str.length();i++) {
			 char a=str.charAt(i);
			 if(a!='0'&&a!='1'&&a!='2'&&a!='3'&&a!='4'&&a!='5'&&a!='6'&& a!='7' && a!='8'&&a!='9') {
				 cnt++;
			 }
			
		 }
		 if(cnt!=0) {
			 return null; 
		 }
		 else {
			 return str;
		 }
	}
}
