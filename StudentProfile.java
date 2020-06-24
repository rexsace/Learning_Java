public class StudentProfile {
	public String firstName;
	public String lastName;
	public int expectedYearToGraduate;
	public double GPA;
	public String major;
	
	public StudentProfile (
		String firstName,
		String lastName,
		int expectedYearToGraduate,
		double GPA,
		String major
	) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.expectedYearToGraduate = expectedYearToGraduate;
		this.GPA = GPA;
		this.major = major;
	}
	
	public void incrementExpectedGraduationYear(){
		this.expectedYearToGraduate++;
	}
}