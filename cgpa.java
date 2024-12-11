import java.util.*;

public class cgpa {
	
	
	
	public static void main(String[] args) {
		//Object creation for user input
		Scanner s  = new Scanner(System.in);
		
		
		// variables
		
		int m = 0;
		int n = 0;
		int n2 =16;
		ArrayList<String> sub =new ArrayList<>();
		
		ArrayList<Integer> n1 = new ArrayList<>();
		
		double grade = 10.00;
		double[] credit = new double[n2];
		int[] obtainedGrade = new int[n2];
		double cgpa = 0;
		double cgpa1 = 0;
		String in ;
		
		
		
		// To print the grade format
		System.out.println("The university Grade calculation is "+grade);
		
		
		//To obtain the no.of semesters CGPA to be calculated
		System.out.print("Enter the no. of Semesters CGPA to be calculated: ");
		m=s.nextInt();
		s.nextLine();
		
		
		for(int j = 0; j < m; j++)
		{
			double res=0;
			double totalCredit =0;
			double gpa = 0;
		
			
		//To obtain the total no.of sub from user
		System.out.print("Enter the total no. of subjects and labs in semester "+(j+1)+" : ");
		n = s.nextInt();
		n1.add(n);
		s.nextLine();
		
		
		
		for (int i = 0; i < n ; i++)
		{
			
			// To obtain the subject name
			System.out.print("Enter the subject "+(i+1)+ " name : ");
			in = s.nextLine();
			sub.add(in);
			s.nextLine();
			
			
			//To obtain the credit of the paper from user
			System.out.print("Enter the credit of this paper: ");
			credit[i] = s.nextDouble();
			s.nextLine();
			
			
			
			//To obtain the Obtained Grade for the subject from user
			System.out.print("Enter the obtained grade in numbers O:10 , A+:9, A:8, B+:7, B:6, C:5 ,U:4 :");
			obtainedGrade[i] =s.nextInt();
			
			
			//If any Arrear occur
			if(obtainedGrade[i] <= 4)
			{
				System.out.println("Doesn't calculate CGPA");
				break;
			}
			
			
			//calculation of GPA
			res = res+(credit[i]*obtainedGrade[i]);
			totalCredit = totalCredit + credit[i];
			
			
			}
		
		
		//Converting the obtained result into CGPA or GPA 
		gpa = res / totalCredit;
		
		System.out.println("Your GPA of semester"+(j+1)+ "is: "+gpa);
		
		cgpa = cgpa + gpa;
		
		
		}
		
		cgpa1 = cgpa / m;
		
		System.out.println("Your CGPA is :"+cgpa1);
		
		s.close();
		
	}
		

}
