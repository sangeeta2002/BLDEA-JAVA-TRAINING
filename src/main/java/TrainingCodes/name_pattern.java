package TrainingCodes;

import java.util.Scanner;
public class name_pattern {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the vslue ofn n:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) { 
				if(j==0 || i==0 || i==(n/2)||i==(n-1)) {
					System.out.print("*  ");
				}
			else {
					System.out.print("   ");
				}
			}
			System.out.println( );
		}
		

	} 
	

}
