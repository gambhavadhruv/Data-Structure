import java.util.*;
public class Clock_Angle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the hour : ");
		int hh = sc.nextInt();
		System.out.println("enter the minute : ");
		int mm = sc.nextInt();
		int a = hh*30;
		int b = mm*6;
		double c;
		if (a>b) {
			if (a-b>180 || a-b==180) {
				c = 360-(a-b)-(0.5*mm);	
				System.out.println("The angle between hour and minute is : "+c);
			}
			else{
				c = (a-b)+(0.5*mm);	
				System.out.println("The angle between hour and minute is : "+c);	
			}
		}
		if (b>a) {
			if (b-a>180) {
				c = 360-(b-a)+(0.5*mm);	
				System.out.println("The angle between hour and minute is : "+c);
			}
			else{
				c = (b-a)-(0.5*mm);	
				System.out.println("The angle between hour and minute is : "+c);	
			}
		}
		if (a==b) {
			c = 0.5*mm;
			System.out.println("The angle between hour and minute is : "+c);			
		}


	}
}
