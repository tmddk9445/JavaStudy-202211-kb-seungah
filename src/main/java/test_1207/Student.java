package test_1207;

class Student {
	private int studentCode;
	private String studentName;

	public Student(int studentCode, String studentName) {
		this.studentCode = studentCode;
		this.studentName = studentName;
	}

	public void showStudnet() {
		System.out.println("학번: " + studentCode + ", " + " 이름: " + studentName);
	}
}
