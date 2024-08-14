// Chapter 1 ( Triangle.java )

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
    
        for (int i = 1; i <= rows; i++) {
          
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print 'T' with spaces between them
            for (int j = 1; j <= i; j++) {
                System.out.print("T ");
            }
           
            System.out.println();
        }

    }
}

/* import java.util.*; 
class pattern { 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number of rows to be printed"); 
		int rows = sc.nextInt(); 
      
		for (int a = 1; a <= rows; a++) { 
      
			for (int b = rows; b >= a; b--) { 
				System.out.print(" "); 
			} 

			for (int b = 1; b <= a; b++) { 
				System.out.print("* "); 
			} 

			System.out.println(); 
		} 
	} 
}  */
