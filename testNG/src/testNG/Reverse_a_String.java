package testNG;

public class Reverse_a_String {

	public static void main(String[] args) {
	int a=10, b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+","+b);
	
		 String Sname = "Ramesh";
		 char rev ;
		String print = "";
		
		
		  for(int i=Sname.length()-1;i>=0;i--) {
		 rev= Sname.charAt(i);
		print=print+rev;
		 
		  }
		  System.out.print("Reversed word : " +print);
		  
		  
		 	}

		 }