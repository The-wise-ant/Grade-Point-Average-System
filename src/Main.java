
public class Main {

	public static void main(String[] args) {

		
		Student andy = new Student("Andy");
		
		andy.add("Mathematics", 'C');
		andy.add("English", 'A');
		andy.add("History", 'B');
		andy.add("Geography", 'D');

		System.out.println(andy.getName() + " has a GPA pf " + andy.getGPA());
		
		System.out.println("It is obtained  from these subjects: " );
		
		for(String str: andy.getSubjects()) {
			
			System.out.println(str);
		}



		
		double A = 4.0;
		double B = 3.0;
		double C = 2.0;
		double D = 1.0;
		double F = 0.0;
	}

}
