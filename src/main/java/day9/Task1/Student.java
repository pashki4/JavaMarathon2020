package day9.Task1;

public class Student extends Human {
	private String studyGroup;

	public Student(String name, String course) {
		super(name);
		this.studyGroup = course;
	}

	public void setCourse(String course) {
		this.studyGroup = course;
	}

	public String getGroupName() {
		return studyGroup;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Этот студент с именем " + this.getName());
	}

}
