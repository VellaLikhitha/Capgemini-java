package test_project;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=85;
		//int y=20;
		
		if (x<50) {
			System.out.println("fail");
		}
		else if(x>=50 && x<60) {
			System.out.println("D grade");
		}
		else if(x>=60 && x<75) {
			System.out.println("C grade");
		}
		else if(x>=75 && x<90) {
			System.out.println("B grade");
		}
		else if(x>=90 && x<100) {
			System.out.println("A grade");
		}
		else {
			System.out.println("Invalid!");
		}
	}
}
