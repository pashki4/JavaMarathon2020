package day6;

import java.util.Random;

public class Teacher {
	private String name;
	private String course;

	public Teacher(String name, String course) {
		this.name = name;
		this.course = course;
	}

	public void evaluate(Student student) {
		Random random = new Random();
		String stringGrade = "";
		int grade = random.nextInt(4) + 2;
		if (grade == 2)
			stringGrade = "неудовлетворительно";
		else if (grade == 3)
			stringGrade = "удовлетворительно";
		else if (grade == 4)
			stringGrade = "хорошо";
		else
			stringGrade = "отлично";
		System.out.println("Преподаватель " + name
				+ " оценил студента с именем " + student.getName()
				+ " по предмету " + course + " на оценку " + stringGrade);
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
}
