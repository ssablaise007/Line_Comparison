package linecomparison;

import java.util.Scanner;

public class LineLength {

	public static void main(String[] args) {
		double x1,x2,y1,y2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Co-ordinates for x1:");
			x1	= sc.nextDouble();
		
		System.out.println("Co-ordinates for y1::");
			y1	= sc.nextDouble();
		
		System.out.println("Co-ordinates for x2::");
    		x2	= sc.nextDouble();
		
		System.out.println("Co-ordinates for y2::");
			y2	= sc.nextDouble();
			
		double Length_line=Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))); 
		System.out.println("Length of a line::" + Length_line);

		
	}

}
