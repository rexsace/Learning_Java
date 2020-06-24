public class Main {
    public static void main(String[] args) {
		StudentProfile studA = new StudentProfile(
										"Karen",
										"Holmes",
										2022,
										3.25,
										"Chemistry"
									);
									
		StudentProfile studB = new StudentProfile(
										"Wendy",
										"Basket",
										2022,
										3.20,
										"Biology"
									);
		
		System.out.println(studA.firstName + ": " + studA.expectedYearToGraduate);
		studA.incrementExpectedGraduationYear();
		System.out.println(studA.firstName + ": " + studA.expectedYearToGraduate);
    }
}